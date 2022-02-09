package com.wg.authority.user.server.Impl;


import com.wg.authority.common.bean.UserDetails;
import com.wg.authority.common.enums.ResponseStatus;
import com.wg.authority.common.exception.BusinessException;
import com.wg.authority.common.utils.IdWorker;
import com.wg.authority.common.utils.JwtTokenUtil;
import com.wg.authority.common.utils.MD5Util;
import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.entity.UmsMenu;
import com.wg.authority.user.mapper.UmsAdminDynamicSqlSupport;
import com.wg.authority.user.mapper.UmsAdminMapper;
import com.wg.authority.user.mapper.UmsMenuMapper;
import com.wg.authority.user.server.UserService;
import com.wg.authority.user.vo.UserLoginParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.Charsets;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

import static com.wg.authority.user.mapper.UmsAdminDynamicSqlSupport.umsAdmin;
import static com.wg.authority.user.mapper.UmsAdminRoleRelationDynamicSqlSupport.umsAdminRoleRelation;
import static com.wg.authority.user.mapper.UmsMenuDynamicSqlSupport.id;
import static com.wg.authority.user.mapper.UmsMenuDynamicSqlSupport.umsMenu;
import static com.wg.authority.user.mapper.UmsRoleDynamicSqlSupport.umsRole;
import static com.wg.authority.user.mapper.UmsRoleMenuRelationDynamicSqlSupport.umsRoleMenuRelation;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

private final UmsAdminMapper umsAdminMapper;
private final UmsMenuMapper umsMenuMapper;

@Autowired
private JwtTokenUtil jwtTokenUtil;

@Autowired
private UserDetails userDetails;


    @Override
    public UmsAdmin queryByUsernameAndPassword(String username, String password) {
        List<UmsAdmin> sysUsers = umsAdminMapper.selectMany(select(umsAdmin.allColumns())
                .from(umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualTo(username))
                .and(UmsAdminDynamicSqlSupport.password, isEqualTo(MD5Util.MD5Encode(password, Charsets.UTF_8.name())))
                .limit(1)
                .build()
                .render(RenderingStrategies.MYBATIS3));
        return sysUsers.size() > 0 ? sysUsers.get(0) : null;
    }

    @Override
    public UmsAdmin queryByUsername(String userName) {
        List<UmsAdmin> sysUsers = umsAdminMapper.selectMany(select(umsAdmin.allColumns())
                .from(umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualTo(userName))
                .limit(1)
                .build()
                .render(RenderingStrategies.MYBATIS3));
        return sysUsers.size() > 0 ? sysUsers.get(0) : null;

    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        //查询已有用户注册
        SelectStatementProvider statementProvider = select(count(UmsAdminDynamicSqlSupport.id))
                .from(umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualTo(umsAdminParam.getUsername()))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        long count = umsAdminMapper.count(statementProvider);
        if (count > 0){
            //用户名已注册
            throw new BusinessException(ResponseStatus.USERNAME_EXIST);
        }

        //开始注册
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam,umsAdmin);
        Long id = new IdWorker().nextId();
        umsAdmin.setId(id);
        umsAdmin.setUsername(umsAdmin.getUsername());
        umsAdmin.setPassword(MD5Util.MD5Encode(umsAdmin.getPassword(),Charsets.UTF_8.name()));
        umsAdmin.setEmail(umsAdmin.getEmail());
        umsAdmin.setStatus(umsAdmin.getStatus());
        umsAdmin.setNickName(umsAdmin.getNickName());
        umsAdmin.setNote(umsAdmin.getNote());
        Date date = new Date();
        umsAdmin.setCreateTime(date);
        umsAdmin.setLoginTime(date);
        //插入数据库
        int selective = umsAdminMapper.insertSelective(umsAdmin);
        if (selective < 0){
            throw new BusinessException(ResponseStatus.INSERT_ERROR);
        }
        return umsAdmin;
    }

    @Override
    public String login(UserLoginParam userLoginParam) {
        //拿到号码和密码
        String username = userLoginParam.getUsername();
        String password = userLoginParam.getPassword();
        //为空判断
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            throw new BusinessException(ResponseStatus.USERNAME_PASS_ERROR);
        }
        //判断号码正确性
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectMany(select(umsAdmin.allColumns())
                .from(umsAdmin)
                .where(UmsAdminDynamicSqlSupport.username, isEqualTo(userLoginParam.getUsername()))
                .build()
                .render(RenderingStrategies.MYBATIS3));
        if (StringUtils.isEmpty(umsAdmins)){
            throw new BusinessException(ResponseStatus.NO_USER);
        }
        //判断密码正确性(通过手机号查出来的密码)
        if (!MD5Util.MD5Encode(password,Charsets.UTF_8.name()).equals(umsAdmins.get(0).getPassword())){
            throw new BusinessException(ResponseStatus.ES_SEARCH_FAIL);
        }
        //判断用户是否被禁用
        Integer status = umsAdmins.get(0).getStatus();
        if (status <= 0){
            throw new BusinessException(ResponseStatus.DISABLE_USER);
        }
        //返回jwtToken字符串

        String token = jwtTokenUtil.generateToken(userDetails);

        return token;

    }

    @Override
    public List<UmsMenu> getPermissionList(Long adminId) {
        List<UmsMenu> umsMenus = umsMenuMapper.selectMany(select(umsMenu.allColumns())
                .from(umsAdminRoleRelation, "ar")
                .leftJoin(umsRole, "r").on(umsAdminRoleRelation.roleId, equalTo(umsRole.id))
                .leftJoin(umsRoleMenuRelation, "rm").on(umsRole.id, equalTo(umsRoleMenuRelation.roleId))
                .leftJoin(umsMenu, "m").on(umsRoleMenuRelation.menuId, equalTo(umsMenu.id))
                .where(umsAdminRoleRelation.adminId ,isEqualTo(adminId))
                .and(id, isNotNull())
                .groupBy(id)
                .build()
                .render(RenderingStrategies.MYBATIS3));
                return umsMenus;
    }


}

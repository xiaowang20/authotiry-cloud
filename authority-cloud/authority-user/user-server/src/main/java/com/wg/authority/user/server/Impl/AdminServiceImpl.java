package com.wg.authority.user.server.Impl;

import com.wg.authority.common.utils.MD5Util;
import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.entity.UmsAdminRoleRelation;
import com.wg.authority.user.mapper.UmsAdminMapper;
import com.wg.authority.user.mapper.UmsAdminRoleRelationMapper;
import com.wg.authority.user.server.AdminService;
import org.apache.commons.codec.Charsets;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.wg.authority.user.mapper.UmsAdminRoleRelationDynamicSqlSupport.umsAdminRoleRelation;
import static org.mybatis.dynamic.sql.SqlBuilder.deleteFrom;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;


@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Autowired
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Override
    public int updateByAdminParam(Long adminId, UmsAdmin umsAdminParam) {
        //查询admin信息
        umsAdminParam.setId(adminId);
        UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(adminId);
        //判断密码是否一致
        if (!umsAdmin.getPassword().equals(umsAdminParam.getPassword())){
            if (StringUtils.isEmpty(umsAdminParam.getPassword())){
                umsAdminParam.setPassword(null);
            }else {
                umsAdminParam.setPassword(MD5Util.MD5Encode(umsAdminParam.getPassword(), Charsets.UTF_8.name()));
            }
        }else {
            umsAdminParam.setPassword(null);
        }
        //修改
        return umsAdminMapper.updateByPrimaryKeySelective(umsAdminParam);

    }

    @Override
    public int assignRole(Long adminId, List<Long> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
    //删除原来的关系
        DeleteStatementProvider render = deleteFrom(umsAdminRoleRelation)
                .where(umsAdminRoleRelation.adminId, isEqualTo(adminId)).build().render(RenderingStrategies.MYBATIS3);
        //重新添加
        if (!StringUtils.isEmpty(roleIds)){

            for (Long roleId : roleIds){
                UmsAdminRoleRelation adminRoleRelation = new UmsAdminRoleRelation();
                adminRoleRelation.setAdminId(adminId);
                adminRoleRelation.setRoleId(roleId);
                adminRoleRelationMapper.insert(adminRoleRelation);
            }
        }

        return count;
    }
}

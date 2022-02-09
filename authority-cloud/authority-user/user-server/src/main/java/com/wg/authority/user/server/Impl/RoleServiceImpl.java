package com.wg.authority.user.server.Impl;

import com.wg.authority.user.entity.UmsRoleMenuRelation;
import com.wg.authority.user.entity.UmsRoleResourceRelation;
import com.wg.authority.user.mapper.UmsRoleMenuRelationDynamicSqlSupport;
import com.wg.authority.user.mapper.UmsRoleMenuRelationMapper;
import com.wg.authority.user.mapper.UmsRoleResourceRelationDynamicSqlSupport;
import com.wg.authority.user.mapper.UmsRoleResourceRelationMapper;
import com.wg.authority.user.server.RoleService;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.wg.authority.user.mapper.UmsRoleMenuRelationDynamicSqlSupport.umsRoleMenuRelation;
import static com.wg.authority.user.mapper.UmsRoleResourceRelationDynamicSqlSupport.umsRoleResourceRelation;
import static org.mybatis.dynamic.sql.SqlBuilder.deleteFrom;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UmsRoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;

    @Override
    public int assignMenu(Long roleId, List<Long> menuIds) {
        //删除原来的菜单
        deleteFrom(umsRoleMenuRelation)
                .where(UmsRoleMenuRelationDynamicSqlSupport.roleId,isEqualTo(roleId))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        //重新添加菜单
        if (!StringUtils.isEmpty(menuIds)){
            for (Long menuId : menuIds) {
                UmsRoleMenuRelation roleMenuRelation = new UmsRoleMenuRelation();
                roleMenuRelation.setMenuId(roleId);
                roleMenuRelation.setMenuId(menuId);
                roleMenuRelationMapper.insertSelective(roleMenuRelation);
            }
        }
        return menuIds.size();
    }

    @Override
    public int assignResource(Long roleId, List<Long> resourceIds) {
        //删除原来资源
        deleteFrom(umsRoleResourceRelation)
                .where(UmsRoleResourceRelationDynamicSqlSupport.roleId,isEqualTo(roleId))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        //重新添加
        if (!StringUtils.isEmpty(roleId)){
            for (Long resourceId : resourceIds){
                UmsRoleResourceRelation roleResourceRelation = new UmsRoleResourceRelation();
                roleResourceRelation.setRoleId(roleId);
                roleResourceRelation.setResourceId(resourceId);
                roleResourceRelationMapper.insertSelective(roleResourceRelation);
            }
        }
        return resourceIds.size();
    }
}

package com.wg.authority.generate.entity;

import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_menu
 */
public class SysRoleMenu {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.id")
    private Long id;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.role_id")
    private Long roleId;

    /**
     * Database Column Remarks:
     *   菜单ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.menu_id")
    private Long menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.role_id")
    public Long getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.role_id")
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.menu_id")
    public Long getMenuId() {
        return menuId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.menu_id")
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}
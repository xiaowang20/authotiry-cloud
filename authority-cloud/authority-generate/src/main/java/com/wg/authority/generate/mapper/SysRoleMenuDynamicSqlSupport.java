package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_menu")
    public static final SysRoleMenu sysRoleMenu = new SysRoleMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.id")
    public static final SqlColumn<Long> id = sysRoleMenu.id;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.role_id")
    public static final SqlColumn<Long> roleId = sysRoleMenu.roleId;

    /**
     * Database Column Remarks:
     *   菜单ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_menu.menu_id")
    public static final SqlColumn<Long> menuId = sysRoleMenu.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_menu")
    public static final class SysRoleMenu extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> menuId = column("menu_id", JDBCType.BIGINT);

        public SysRoleMenu() {
            super("sys_role_menu");
        }
    }
}
package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    public static final SysMenu sysMenu = new SysMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.menu_id")
    public static final SqlColumn<Long> menuId = sysMenu.menuId;

    /**
     * Database Column Remarks:
     *   父菜单ID，一级菜单为0
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.parent_id")
    public static final SqlColumn<Long> parentId = sysMenu.parentId;

    /**
     * Database Column Remarks:
     *   菜单名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.name")
    public static final SqlColumn<String> name = sysMenu.name;

    /**
     * Database Column Remarks:
     *   菜单URL
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.url")
    public static final SqlColumn<String> url = sysMenu.url;

    /**
     * Database Column Remarks:
     *   授权(多个用逗号分隔，如：user:list,user:create)
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.perms")
    public static final SqlColumn<String> perms = sysMenu.perms;

    /**
     * Database Column Remarks:
     *   类型   0：目录   1：菜单   2：按钮
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.type")
    public static final SqlColumn<Integer> type = sysMenu.type;

    /**
     * Database Column Remarks:
     *   菜单图标
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.icon")
    public static final SqlColumn<String> icon = sysMenu.icon;

    /**
     * Database Column Remarks:
     *   排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.order_num")
    public static final SqlColumn<Integer> orderNum = sysMenu.orderNum;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.gmt_create")
    public static final SqlColumn<Date> gmtCreate = sysMenu.gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_menu.gmt_modified")
    public static final SqlColumn<Date> gmtModified = sysMenu.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    public static final class SysMenu extends SqlTable {
        public final SqlColumn<Long> menuId = column("menu_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> perms = column("perms", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> orderNum = column("order_num", JDBCType.INTEGER);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public SysMenu() {
            super("sys_menu");
        }
    }
}
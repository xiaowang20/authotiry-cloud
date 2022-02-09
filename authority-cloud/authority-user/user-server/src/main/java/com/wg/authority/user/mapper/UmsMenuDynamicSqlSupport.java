package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    public static final UmsMenu umsMenu = new UmsMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.id")
    public static final SqlColumn<Long> id = umsMenu.id;

    /**
     * Database Column Remarks:
     *   父级ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.parent_id")
    public static final SqlColumn<Long> parentId = umsMenu.parentId;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.create_time")
    public static final SqlColumn<Date> createTime = umsMenu.createTime;

    /**
     * Database Column Remarks:
     *   菜单名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.title")
    public static final SqlColumn<String> title = umsMenu.title;

    /**
     * Database Column Remarks:
     *   菜单级数
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.level")
    public static final SqlColumn<Integer> level = umsMenu.level;

    /**
     * Database Column Remarks:
     *   菜单排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.sort")
    public static final SqlColumn<Integer> sort = umsMenu.sort;

    /**
     * Database Column Remarks:
     *   前端名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.name")
    public static final SqlColumn<String> name = umsMenu.name;

    /**
     * Database Column Remarks:
     *   前端图标
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.icon")
    public static final SqlColumn<String> icon = umsMenu.icon;

    /**
     * Database Column Remarks:
     *   前端隐藏
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_menu.hidden")
    public static final SqlColumn<Integer> hidden = umsMenu.hidden;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    public static final class UmsMenu extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> level = column("level", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> hidden = column("hidden", JDBCType.INTEGER);

        public UmsMenu() {
            super("ums_menu");
        }
    }
}
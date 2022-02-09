package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    public static final UmsRole umsRole = new UmsRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.id")
    public static final SqlColumn<Long> id = umsRole.id;

    /**
     * Database Column Remarks:
     *   名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.name")
    public static final SqlColumn<String> name = umsRole.name;

    /**
     * Database Column Remarks:
     *   描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.description")
    public static final SqlColumn<String> description = umsRole.description;

    /**
     * Database Column Remarks:
     *   后台用户数量
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.admin_count")
    public static final SqlColumn<Integer> adminCount = umsRole.adminCount;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.create_time")
    public static final SqlColumn<Date> createTime = umsRole.createTime;

    /**
     * Database Column Remarks:
     *   启用状态：0->禁用；1->启用
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.status")
    public static final SqlColumn<Integer> status = umsRole.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role.sort")
    public static final SqlColumn<Integer> sort = umsRole.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    public static final class UmsRole extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> adminCount = column("admin_count", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public UmsRole() {
            super("ums_role");
        }
    }
}
package com.wg.authority.user.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;

public final class UmsAdminRoleRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    public static final UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_role_relation.id")
    public static final SqlColumn<Long> id = umsAdminRoleRelation.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_role_relation.admin_id")
    public static SqlColumn<Object> adminId = umsAdminRoleRelation.adminId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_role_relation.role_id")
    public static final SqlColumn<Long> roleId = umsAdminRoleRelation.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    public static final class UmsAdminRoleRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Object> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public UmsAdminRoleRelation() {
            super("ums_admin_role_relation");
        }
    }
}
package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsRoleResourceRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    public static final UmsRoleResourceRelation umsRoleResourceRelation = new UmsRoleResourceRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_resource_relation.id")
    public static final SqlColumn<Long> id = umsRoleResourceRelation.id;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_resource_relation.role_id")
    public static final SqlColumn<Long> roleId = umsRoleResourceRelation.roleId;

    /**
     * Database Column Remarks:
     *   资源ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_resource_relation.resource_id")
    public static final SqlColumn<Long> resourceId = umsRoleResourceRelation.resourceId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    public static final class UmsRoleResourceRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> resourceId = column("resource_id", JDBCType.BIGINT);

        public UmsRoleResourceRelation() {
            super("ums_role_resource_relation");
        }
    }
}
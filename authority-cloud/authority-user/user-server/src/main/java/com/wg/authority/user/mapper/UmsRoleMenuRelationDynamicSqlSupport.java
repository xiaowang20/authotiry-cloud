package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsRoleMenuRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    public static final UmsRoleMenuRelation umsRoleMenuRelation = new UmsRoleMenuRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_menu_relation.id")
    public static final SqlColumn<Long> id = umsRoleMenuRelation.id;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_menu_relation.role_id")
    public static final SqlColumn<Long> roleId = umsRoleMenuRelation.roleId;

    /**
     * Database Column Remarks:
     *   菜单ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_role_menu_relation.menu_id")
    public static final SqlColumn<Long> menuId = umsRoleMenuRelation.menuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    public static final class UmsRoleMenuRelation extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> menuId = column("menu_id", JDBCType.BIGINT);

        public UmsRoleMenuRelation() {
            super("ums_role_menu_relation");
        }
    }
}
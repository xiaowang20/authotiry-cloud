package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleDataPermDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    public static final SysRoleDataPerm sysRoleDataPerm = new SysRoleDataPerm();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_data_perm.id")
    public static final SqlColumn<Long> id = sysRoleDataPerm.id;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_data_perm.role_id")
    public static final SqlColumn<Long> roleId = sysRoleDataPerm.roleId;

    /**
     * Database Column Remarks:
     *   权限ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role_data_perm.perm_id")
    public static final SqlColumn<Long> permId = sysRoleDataPerm.permId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    public static final class SysRoleDataPerm extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> permId = column("perm_id", JDBCType.BIGINT);

        public SysRoleDataPerm() {
            super("sys_role_data_perm");
        }
    }
}
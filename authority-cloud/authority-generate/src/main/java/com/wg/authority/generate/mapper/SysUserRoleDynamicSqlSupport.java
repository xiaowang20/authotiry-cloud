package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user_role")
    public static final SysUserRole sysUserRole = new SysUserRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user_role.id")
    public static final SqlColumn<Long> id = sysUserRole.id;

    /**
     * Database Column Remarks:
     *   用户ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user_role.user_id")
    public static final SqlColumn<Long> userId = sysUserRole.userId;

    /**
     * Database Column Remarks:
     *   角色ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user_role.role_id")
    public static final SqlColumn<Long> roleId = sysUserRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user_role")
    public static final class SysUserRole extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public SysUserRole() {
            super("sys_user_role");
        }
    }
}
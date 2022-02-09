package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    public static final SysRole sysRole = new SysRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.role_id")
    public static final SqlColumn<Long> roleId = sysRole.roleId;

    /**
     * Database Column Remarks:
     *   角色名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.role_name")
    public static final SqlColumn<String> roleName = sysRole.roleName;

    /**
     * Database Column Remarks:
     *   角色标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.role_sign")
    public static final SqlColumn<String> roleSign = sysRole.roleSign;

    /**
     * Database Column Remarks:
     *   备注
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.remark")
    public static final SqlColumn<String> remark = sysRole.remark;

    /**
     * Database Column Remarks:
     *   创建用户id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.user_id_create")
    public static final SqlColumn<Long> userIdCreate = sysRole.userIdCreate;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.gmt_create")
    public static final SqlColumn<Date> gmtCreate = sysRole.gmtCreate;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_role.gmt_modified")
    public static final SqlColumn<Date> gmtModified = sysRole.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    public static final class SysRole extends SqlTable {
        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<String> roleName = column("role_name", JDBCType.VARCHAR);

        public final SqlColumn<String> roleSign = column("role_sign", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<Long> userIdCreate = column("user_id_create", JDBCType.BIGINT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public SysRole() {
            super("sys_role");
        }
    }
}
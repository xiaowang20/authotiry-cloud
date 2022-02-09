package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsAdminDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin")
    public static final UmsAdmin umsAdmin = new UmsAdmin();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.id")
    public static final SqlColumn<Long> id = umsAdmin.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.username")
    public static final SqlColumn<String> username = umsAdmin.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.password")
    public static final SqlColumn<String> password = umsAdmin.password;

    /**
     * Database Column Remarks:
     *   头像
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.icon")
    public static final SqlColumn<String> icon = umsAdmin.icon;

    /**
     * Database Column Remarks:
     *   邮箱
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.email")
    public static final SqlColumn<String> email = umsAdmin.email;

    /**
     * Database Column Remarks:
     *   昵称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.nick_name")
    public static final SqlColumn<String> nickName = umsAdmin.nickName;

    /**
     * Database Column Remarks:
     *   备注信息
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.note")
    public static final SqlColumn<String> note = umsAdmin.note;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.create_time")
    public static final SqlColumn<Date> createTime = umsAdmin.createTime;

    /**
     * Database Column Remarks:
     *   最后登录时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.login_time")
    public static final SqlColumn<Date> loginTime = umsAdmin.loginTime;

    /**
     * Database Column Remarks:
     *   帐号启用状态：0->禁用；1->启用
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.status")
    public static final SqlColumn<Integer> status = umsAdmin.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin")
    public static final class UmsAdmin extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> loginTime = column("login_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public UmsAdmin() {
            super("ums_admin");
        }
    }
}
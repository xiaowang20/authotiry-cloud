package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsAdminLoginLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    public static final UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.id")
    public static final SqlColumn<Long> id = umsAdminLoginLog.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.admin_id")
    public static final SqlColumn<Long> adminId = umsAdminLoginLog.adminId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.create_time")
    public static final SqlColumn<Date> createTime = umsAdminLoginLog.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.ip")
    public static final SqlColumn<String> ip = umsAdminLoginLog.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.address")
    public static final SqlColumn<String> address = umsAdminLoginLog.address;

    /**
     * Database Column Remarks:
     *   浏览器登录类型
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin_login_log.user_agent")
    public static final SqlColumn<String> userAgent = umsAdminLoginLog.userAgent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    public static final class UmsAdminLoginLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public UmsAdminLoginLog() {
            super("ums_admin_login_log");
        }
    }
}
package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    public static final SysUser sysUser = new SysUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.user_id")
    public static final SqlColumn<Long> userId = sysUser.userId;

    /**
     * Database Column Remarks:
     *   用户名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.username")
    public static final SqlColumn<String> username = sysUser.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.name")
    public static final SqlColumn<String> name = sysUser.name;

    /**
     * Database Column Remarks:
     *   密码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.password")
    public static final SqlColumn<String> password = sysUser.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.dept_id")
    public static final SqlColumn<Long> deptId = sysUser.deptId;

    /**
     * Database Column Remarks:
     *   邮箱
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.email")
    public static final SqlColumn<String> email = sysUser.email;

    /**
     * Database Column Remarks:
     *   手机号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.mobile")
    public static final SqlColumn<String> mobile = sysUser.mobile;

    /**
     * Database Column Remarks:
     *   状态 0:禁用，1:正常
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.status")
    public static final SqlColumn<Byte> status = sysUser.status;

    /**
     * Database Column Remarks:
     *   创建用户id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.user_id_create")
    public static final SqlColumn<Long> userIdCreate = sysUser.userIdCreate;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.gmt_create")
    public static final SqlColumn<Date> gmtCreate = sysUser.gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.gmt_modified")
    public static final SqlColumn<Date> gmtModified = sysUser.gmtModified;

    /**
     * Database Column Remarks:
     *   性别
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.sex")
    public static final SqlColumn<Long> sex = sysUser.sex;

    /**
     * Database Column Remarks:
     *   出身日期
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.birth")
    public static final SqlColumn<Date> birth = sysUser.birth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.pic_id")
    public static final SqlColumn<Long> picId = sysUser.picId;

    /**
     * Database Column Remarks:
     *   现居住地
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.live_address")
    public static final SqlColumn<String> liveAddress = sysUser.liveAddress;

    /**
     * Database Column Remarks:
     *   爱好
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.hobby")
    public static final SqlColumn<String> hobby = sysUser.hobby;

    /**
     * Database Column Remarks:
     *   省份
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.province")
    public static final SqlColumn<String> province = sysUser.province;

    /**
     * Database Column Remarks:
     *   所在城市
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.city")
    public static final SqlColumn<String> city = sysUser.city;

    /**
     * Database Column Remarks:
     *   所在地区
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_user.district")
    public static final SqlColumn<String> district = sysUser.district;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    public static final class SysUser extends SqlTable {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Long> deptId = column("dept_id", JDBCType.BIGINT);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Long> userIdCreate = column("user_id_create", JDBCType.BIGINT);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> sex = column("sex", JDBCType.BIGINT);

        public final SqlColumn<Date> birth = column("birth", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> picId = column("pic_id", JDBCType.BIGINT);

        public final SqlColumn<String> liveAddress = column("live_address", JDBCType.VARCHAR);

        public final SqlColumn<String> hobby = column("hobby", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> district = column("district", JDBCType.VARCHAR);

        public SysUser() {
            super("sys_user");
        }
    }
}
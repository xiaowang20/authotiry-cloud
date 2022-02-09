package com.wg.authority.generate.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysDataPermDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    public static final SysDataPerm sysDataPerm = new SysDataPerm();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.id")
    public static final SqlColumn<Long> id = sysDataPerm.id;

    /**
     * Database Column Remarks:
     *   权限名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.name")
    public static final SqlColumn<String> name = sysDataPerm.name;

    /**
     * Database Column Remarks:
     *   数据表名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.table_name")
    public static final SqlColumn<String> tableName = sysDataPerm.tableName;

    /**
     * Database Column Remarks:
     *   所属模块
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.module_name")
    public static final SqlColumn<String> moduleName = sysDataPerm.moduleName;

    /**
     * Database Column Remarks:
     *   用户权限控制属性名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.crl_attr_name")
    public static final SqlColumn<String> crlAttrName = sysDataPerm.crlAttrName;

    /**
     * Database Column Remarks:
     *   数据表权限控制列名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.crl_column_name")
    public static final SqlColumn<String> crlColumnName = sysDataPerm.crlColumnName;

    /**
     * Database Column Remarks:
     *   权限code，all_开头表示查看所有数据的权限，sup_开头表示查看下级数据的权限，own_开头表示查看本级数据的权限
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.perm_code")
    public static final SqlColumn<String> permCode = sysDataPerm.permCode;

    /**
     * Database Column Remarks:
     *   排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.order_num")
    public static final SqlColumn<Integer> orderNum = sysDataPerm.orderNum;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.gmt_create")
    public static final SqlColumn<Date> gmtCreate = sysDataPerm.gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sys_data_perm.gmt_modified")
    public static final SqlColumn<Date> gmtModified = sysDataPerm.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    public static final class SysDataPerm extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> moduleName = column("module_name", JDBCType.VARCHAR);

        public final SqlColumn<String> crlAttrName = column("crl_attr_name", JDBCType.VARCHAR);

        public final SqlColumn<String> crlColumnName = column("crl_column_name", JDBCType.VARCHAR);

        public final SqlColumn<String> permCode = column("perm_code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> orderNum = column("order_num", JDBCType.INTEGER);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public SysDataPerm() {
            super("sys_data_perm");
        }
    }
}
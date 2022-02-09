package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsResourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    public static final UmsResource umsResource = new UmsResource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.id")
    public static final SqlColumn<Long> id = umsResource.id;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.create_time")
    public static final SqlColumn<Date> createTime = umsResource.createTime;

    /**
     * Database Column Remarks:
     *   资源名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.name")
    public static final SqlColumn<String> name = umsResource.name;

    /**
     * Database Column Remarks:
     *   资源URL
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.url")
    public static final SqlColumn<String> url = umsResource.url;

    /**
     * Database Column Remarks:
     *   描述
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.description")
    public static final SqlColumn<String> description = umsResource.description;

    /**
     * Database Column Remarks:
     *   资源分类ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource.category_id")
    public static final SqlColumn<Long> categoryId = umsResource.categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    public static final class UmsResource extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Long> categoryId = column("category_id", JDBCType.BIGINT);

        public UmsResource() {
            super("ums_resource");
        }
    }
}
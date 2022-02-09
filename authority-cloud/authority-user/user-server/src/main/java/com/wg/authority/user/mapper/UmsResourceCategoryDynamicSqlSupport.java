package com.wg.authority.user.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsResourceCategoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    public static final UmsResourceCategory umsResourceCategory = new UmsResourceCategory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource_category.id")
    public static final SqlColumn<Long> id = umsResourceCategory.id;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource_category.create_time")
    public static final SqlColumn<Date> createTime = umsResourceCategory.createTime;

    /**
     * Database Column Remarks:
     *   分类名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource_category.name")
    public static final SqlColumn<String> name = umsResourceCategory.name;

    /**
     * Database Column Remarks:
     *   排序
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_resource_category.sort")
    public static final SqlColumn<Integer> sort = umsResourceCategory.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    public static final class UmsResourceCategory extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public UmsResourceCategory() {
            super("ums_resource_category");
        }
    }
}
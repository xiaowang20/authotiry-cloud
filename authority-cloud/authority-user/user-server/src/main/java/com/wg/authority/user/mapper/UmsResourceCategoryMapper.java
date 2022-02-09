package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsResourceCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsResourceCategory;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface UmsResourceCategoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsResourceCategory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsResourceCategoryResult")
    UmsResourceCategory selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsResourceCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<UmsResourceCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsResourceCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsResourceCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsResourceCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default int insert(UmsResourceCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(umsResourceCategory)
                .map(id).toProperty("id")
                .map(createTime).toProperty("createTime")
                .map(name).toProperty("name")
                .map(sort).toProperty("sort")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default int insertSelective(UmsResourceCategory record) {
        return insert(SqlBuilder.insert(record)
                .into(umsResourceCategory)
                .map(id).toProperty("id")
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(sort).toPropertyWhenPresent("sort", record::getSort)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsResourceCategory>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, createTime, name, sort)
                .from(umsResourceCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsResourceCategory>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, createTime, name, sort)
                .from(umsResourceCategory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default UmsResourceCategory selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, createTime, name, sort)
                .from(umsResourceCategory)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsResourceCategory record) {
        return UpdateDSL.updateWithMapper(this::update, umsResourceCategory)
                .set(id).equalTo(record::getId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(name).equalTo(record::getName)
                .set(sort).equalTo(record::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsResourceCategory record) {
        return UpdateDSL.updateWithMapper(this::update, umsResourceCategory)
                .set(id).equalToWhenPresent(record::getId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(name).equalToWhenPresent(record::getName)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default int updateByPrimaryKey(UmsResourceCategory record) {
        return UpdateDSL.updateWithMapper(this::update, umsResourceCategory)
                .set(createTime).equalTo(record::getCreateTime)
                .set(name).equalTo(record::getName)
                .set(sort).equalTo(record::getSort)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource_category")
    default int updateByPrimaryKeySelective(UmsResourceCategory record) {
        return UpdateDSL.updateWithMapper(this::update, umsResourceCategory)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(name).equalToWhenPresent(record::getName)
                .set(sort).equalToWhenPresent(record::getSort)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
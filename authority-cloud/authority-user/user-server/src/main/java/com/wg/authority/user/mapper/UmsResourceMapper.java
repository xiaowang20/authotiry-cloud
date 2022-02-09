package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsResourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsResource;
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
public interface UmsResourceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsResource> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsResourceResult")
    UmsResource selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsResourceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsResource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsResource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsResource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsResource)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default int insert(UmsResource record) {
        return insert(SqlBuilder.insert(record)
                .into(umsResource)
                .map(id).toProperty("id")
                .map(createTime).toProperty("createTime")
                .map(name).toProperty("name")
                .map(url).toProperty("url")
                .map(description).toProperty("description")
                .map(categoryId).toProperty("categoryId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default int insertSelective(UmsResource record) {
        return insert(SqlBuilder.insert(record)
                .into(umsResource)
                .map(id).toProperty("id")
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(url).toPropertyWhenPresent("url", record::getUrl)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(categoryId).toPropertyWhenPresent("categoryId", record::getCategoryId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsResource>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, createTime, name, url, description, categoryId)
                .from(umsResource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsResource>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, createTime, name, url, description, categoryId)
                .from(umsResource);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default UmsResource selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, createTime, name, url, description, categoryId)
                .from(umsResource)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsResource record) {
        return UpdateDSL.updateWithMapper(this::update, umsResource)
                .set(id).equalTo(record::getId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(name).equalTo(record::getName)
                .set(url).equalTo(record::getUrl)
                .set(description).equalTo(record::getDescription)
                .set(categoryId).equalTo(record::getCategoryId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsResource record) {
        return UpdateDSL.updateWithMapper(this::update, umsResource)
                .set(id).equalToWhenPresent(record::getId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(name).equalToWhenPresent(record::getName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(categoryId).equalToWhenPresent(record::getCategoryId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default int updateByPrimaryKey(UmsResource record) {
        return UpdateDSL.updateWithMapper(this::update, umsResource)
                .set(createTime).equalTo(record::getCreateTime)
                .set(name).equalTo(record::getName)
                .set(url).equalTo(record::getUrl)
                .set(description).equalTo(record::getDescription)
                .set(categoryId).equalTo(record::getCategoryId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_resource")
    default int updateByPrimaryKeySelective(UmsResource record) {
        return UpdateDSL.updateWithMapper(this::update, umsResource)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(name).equalToWhenPresent(record::getName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(categoryId).equalToWhenPresent(record::getCategoryId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
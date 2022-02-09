package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsMenu;
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
public interface UmsMenuMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsMenu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMenuResult")
    UmsMenu selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="hidden", property="hidden", jdbcType=JdbcType.INTEGER)
    })
    List<UmsMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsMenu)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default int insert(UmsMenu record) {
        return insert(SqlBuilder.insert(record)
                .into(umsMenu)
                .map(id).toProperty("id")
                .map(parentId).toProperty("parentId")
                .map(createTime).toProperty("createTime")
                .map(title).toProperty("title")
                .map(level).toProperty("level")
                .map(sort).toProperty("sort")
                .map(name).toProperty("name")
                .map(icon).toProperty("icon")
                .map(hidden).toProperty("hidden")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default int insertSelective(UmsMenu record) {
        return insert(SqlBuilder.insert(record)
                .into(umsMenu)
                .map(id).toProperty("id")
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(title).toPropertyWhenPresent("title", record::getTitle)
                .map(level).toPropertyWhenPresent("level", record::getLevel)
                .map(sort).toPropertyWhenPresent("sort", record::getSort)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(icon).toPropertyWhenPresent("icon", record::getIcon)
                .map(hidden).toPropertyWhenPresent("hidden", record::getHidden)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsMenu>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, parentId, createTime, title, level, sort, name, icon, hidden)
                .from(umsMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsMenu>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, parentId, createTime, title, level, sort, name, icon, hidden)
                .from(umsMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default UmsMenu selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, parentId, createTime, title, level, sort, name, icon, hidden)
                .from(umsMenu)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsMenu record) {
        return UpdateDSL.updateWithMapper(this::update, umsMenu)
                .set(id).equalTo(record::getId)
                .set(parentId).equalTo(record::getParentId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(title).equalTo(record::getTitle)
                .set(level).equalTo(record::getLevel)
                .set(sort).equalTo(record::getSort)
                .set(name).equalTo(record::getName)
                .set(icon).equalTo(record::getIcon)
                .set(hidden).equalTo(record::getHidden);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsMenu record) {
        return UpdateDSL.updateWithMapper(this::update, umsMenu)
                .set(id).equalToWhenPresent(record::getId)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(name).equalToWhenPresent(record::getName)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(hidden).equalToWhenPresent(record::getHidden);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default int updateByPrimaryKey(UmsMenu record) {
        return UpdateDSL.updateWithMapper(this::update, umsMenu)
                .set(parentId).equalTo(record::getParentId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(title).equalTo(record::getTitle)
                .set(level).equalTo(record::getLevel)
                .set(sort).equalTo(record::getSort)
                .set(name).equalTo(record::getName)
                .set(icon).equalTo(record::getIcon)
                .set(hidden).equalTo(record::getHidden)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_menu")
    default int updateByPrimaryKeySelective(UmsMenu record) {
        return UpdateDSL.updateWithMapper(this::update, umsMenu)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(name).equalToWhenPresent(record::getName)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(hidden).equalToWhenPresent(record::getHidden)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
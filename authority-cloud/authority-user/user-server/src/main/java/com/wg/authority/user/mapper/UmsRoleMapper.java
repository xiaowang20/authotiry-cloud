package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsRole;
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
public interface UmsRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsRoleResult")
    UmsRole selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_count", property="adminCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<UmsRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRole)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default int insert(UmsRole record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRole)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(description).toProperty("description")
                .map(adminCount).toProperty("adminCount")
                .map(createTime).toProperty("createTime")
                .map(status).toProperty("status")
                .map(sort).toProperty("sort")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default int insertSelective(UmsRole record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRole)
                .map(id).toProperty("id")
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(description).toPropertyWhenPresent("description", record::getDescription)
                .map(adminCount).toPropertyWhenPresent("adminCount", record::getAdminCount)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(sort).toPropertyWhenPresent("sort", record::getSort)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRole>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, description, adminCount, createTime, status, sort)
                .from(umsRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRole>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, description, adminCount, createTime, status, sort)
                .from(umsRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default UmsRole selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, description, adminCount, createTime, status, sort)
                .from(umsRole)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsRole record) {
        return UpdateDSL.updateWithMapper(this::update, umsRole)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(description).equalTo(record::getDescription)
                .set(adminCount).equalTo(record::getAdminCount)
                .set(createTime).equalTo(record::getCreateTime)
                .set(status).equalTo(record::getStatus)
                .set(sort).equalTo(record::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsRole record) {
        return UpdateDSL.updateWithMapper(this::update, umsRole)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(adminCount).equalToWhenPresent(record::getAdminCount)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(sort).equalToWhenPresent(record::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default int updateByPrimaryKey(UmsRole record) {
        return UpdateDSL.updateWithMapper(this::update, umsRole)
                .set(name).equalTo(record::getName)
                .set(description).equalTo(record::getDescription)
                .set(adminCount).equalTo(record::getAdminCount)
                .set(createTime).equalTo(record::getCreateTime)
                .set(status).equalTo(record::getStatus)
                .set(sort).equalTo(record::getSort)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role")
    default int updateByPrimaryKeySelective(UmsRole record) {
        return UpdateDSL.updateWithMapper(this::update, umsRole)
                .set(name).equalToWhenPresent(record::getName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(adminCount).equalToWhenPresent(record::getAdminCount)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(sort).equalToWhenPresent(record::getSort)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
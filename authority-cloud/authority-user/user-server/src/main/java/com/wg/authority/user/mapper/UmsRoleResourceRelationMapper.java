package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsRoleResourceRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsRoleResourceRelation;
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
public interface UmsRoleResourceRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsRoleResourceRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsRoleResourceRelationResult")
    UmsRoleResourceRelation selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsRoleResourceRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsRoleResourceRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsRoleResourceRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRoleResourceRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRoleResourceRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default int insert(UmsRoleResourceRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRoleResourceRelation)
                .map(id).toProperty("id")
                .map(roleId).toProperty("roleId")
                .map(resourceId).toProperty("resourceId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default int insertSelective(UmsRoleResourceRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRoleResourceRelation)
                .map(id).toProperty("id")
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(resourceId).toPropertyWhenPresent("resourceId", record::getResourceId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRoleResourceRelation>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, roleId, resourceId)
                .from(umsRoleResourceRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRoleResourceRelation>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, roleId, resourceId)
                .from(umsRoleResourceRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default UmsRoleResourceRelation selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, roleId, resourceId)
                .from(umsRoleResourceRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsRoleResourceRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleResourceRelation)
                .set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(resourceId).equalTo(record::getResourceId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsRoleResourceRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleResourceRelation)
                .set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(resourceId).equalToWhenPresent(record::getResourceId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default int updateByPrimaryKey(UmsRoleResourceRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleResourceRelation)
                .set(roleId).equalTo(record::getRoleId)
                .set(resourceId).equalTo(record::getResourceId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_resource_relation")
    default int updateByPrimaryKeySelective(UmsRoleResourceRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleResourceRelation)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(resourceId).equalToWhenPresent(record::getResourceId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
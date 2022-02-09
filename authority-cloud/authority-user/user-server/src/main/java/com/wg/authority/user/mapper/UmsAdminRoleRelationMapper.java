package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsAdminRoleRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsAdminRoleRelation;
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
public interface UmsAdminRoleRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsAdminRoleRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsAdminRoleRelationResult")
    UmsAdminRoleRelation selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsAdminRoleRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.BIGINT),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsAdminRoleRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsAdminRoleRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsAdminRoleRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsAdminRoleRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default int insert(UmsAdminRoleRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsAdminRoleRelation)
                .map(id).toProperty("id")
                .map(adminId).toProperty("adminId")
                .map(roleId).toProperty("roleId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default int insertSelective(UmsAdminRoleRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsAdminRoleRelation)
                .map(id).toProperty("id")
                .map(adminId).toPropertyWhenPresent("adminId", record::getAdminId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsAdminRoleRelation>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, adminId, roleId)
                .from(umsAdminRoleRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsAdminRoleRelation>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, adminId, roleId)
                .from(umsAdminRoleRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default UmsAdminRoleRelation selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, adminId, roleId)
                .from(umsAdminRoleRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsAdminRoleRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminRoleRelation)
                .set(id).equalTo(record::getId)
                .set(adminId).equalTo(record::getAdminId)
                .set(roleId).equalTo(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsAdminRoleRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminRoleRelation)
                .set(id).equalToWhenPresent(record::getId)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(roleId).equalToWhenPresent(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default int updateByPrimaryKey(UmsAdminRoleRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminRoleRelation)
                .set(adminId).equalTo(record::getAdminId)
                .set(roleId).equalTo(record::getRoleId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_role_relation")
    default int updateByPrimaryKeySelective(UmsAdminRoleRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminRoleRelation)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
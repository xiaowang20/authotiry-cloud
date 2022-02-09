package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsRoleMenuRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsRoleMenuRelation;
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
public interface UmsRoleMenuRelationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsRoleMenuRelation> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsRoleMenuRelationResult")
    UmsRoleMenuRelation selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsRoleMenuRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsRoleMenuRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsRoleMenuRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRoleMenuRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsRoleMenuRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default int insert(UmsRoleMenuRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRoleMenuRelation)
                .map(id).toProperty("id")
                .map(roleId).toProperty("roleId")
                .map(menuId).toProperty("menuId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default int insertSelective(UmsRoleMenuRelation record) {
        return insert(SqlBuilder.insert(record)
                .into(umsRoleMenuRelation)
                .map(id).toProperty("id")
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(menuId).toPropertyWhenPresent("menuId", record::getMenuId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRoleMenuRelation>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, roleId, menuId)
                .from(umsRoleMenuRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsRoleMenuRelation>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, roleId, menuId)
                .from(umsRoleMenuRelation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default UmsRoleMenuRelation selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, roleId, menuId)
                .from(umsRoleMenuRelation)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsRoleMenuRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleMenuRelation)
                .set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsRoleMenuRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleMenuRelation)
                .set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default int updateByPrimaryKey(UmsRoleMenuRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleMenuRelation)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuId).equalTo(record::getMenuId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_role_menu_relation")
    default int updateByPrimaryKeySelective(UmsRoleMenuRelation record) {
        return UpdateDSL.updateWithMapper(this::update, umsRoleMenuRelation)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuId).equalToWhenPresent(record::getMenuId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
package com.wg.authority.generate.mapper;

import static com.wg.authority.generate.mapper.SysRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.generate.entity.SysRole;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface SysRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysRoleResult")
    SysRole selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysRoleResult", value = {
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_sign", property="roleSign", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id_create", property="userIdCreate", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sysRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default int deleteByPrimaryKey(Long roleId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysRole)
                .where(roleId, isEqualTo(roleId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default int insert(SysRole record) {
        return insert(SqlBuilder.insert(record)
                .into(sysRole)
                .map(roleId).toProperty("roleId")
                .map(roleName).toProperty("roleName")
                .map(roleSign).toProperty("roleSign")
                .map(remark).toProperty("remark")
                .map(userIdCreate).toProperty("userIdCreate")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default int insertSelective(SysRole record) {
        return insert(SqlBuilder.insert(record)
                .into(sysRole)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(roleName).toPropertyWhenPresent("roleName", record::getRoleName)
                .map(roleSign).toPropertyWhenPresent("roleSign", record::getRoleSign)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(userIdCreate).toPropertyWhenPresent("userIdCreate", record::getUserIdCreate)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysRole>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, roleId, roleName, roleSign, remark, userIdCreate, gmtCreate, gmtModified)
                .from(sysRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysRole>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, roleId, roleName, roleSign, remark, userIdCreate, gmtCreate, gmtModified)
                .from(sysRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default SysRole selectByPrimaryKey(Long roleId_) {
        return SelectDSL.selectWithMapper(this::selectOne, roleId, roleName, roleSign, remark, userIdCreate, gmtCreate, gmtModified)
                .from(sysRole)
                .where(roleId, isEqualTo(roleId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SysRole record) {
        return UpdateDSL.updateWithMapper(this::update, sysRole)
                .set(roleId).equalTo(record::getRoleId)
                .set(roleName).equalTo(record::getRoleName)
                .set(roleSign).equalTo(record::getRoleSign)
                .set(remark).equalTo(record::getRemark)
                .set(userIdCreate).equalTo(record::getUserIdCreate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SysRole record) {
        return UpdateDSL.updateWithMapper(this::update, sysRole)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(roleName).equalToWhenPresent(record::getRoleName)
                .set(roleSign).equalToWhenPresent(record::getRoleSign)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(userIdCreate).equalToWhenPresent(record::getUserIdCreate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default int updateByPrimaryKey(SysRole record) {
        return UpdateDSL.updateWithMapper(this::update, sysRole)
                .set(roleName).equalTo(record::getRoleName)
                .set(roleSign).equalTo(record::getRoleSign)
                .set(remark).equalTo(record::getRemark)
                .set(userIdCreate).equalTo(record::getUserIdCreate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(roleId, isEqualTo(record::getRoleId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role")
    default int updateByPrimaryKeySelective(SysRole record) {
        return UpdateDSL.updateWithMapper(this::update, sysRole)
                .set(roleName).equalToWhenPresent(record::getRoleName)
                .set(roleSign).equalToWhenPresent(record::getRoleSign)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(userIdCreate).equalToWhenPresent(record::getUserIdCreate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(roleId, isEqualTo(record::getRoleId))
                .build()
                .execute();
    }
}
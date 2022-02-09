package com.wg.authority.generate.mapper;

import static com.wg.authority.generate.mapper.SysRoleDataPermDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.generate.entity.SysRoleDataPerm;
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
public interface SysRoleDataPermMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<SysRoleDataPerm> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysRoleDataPermResult")
    SysRoleDataPerm selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysRoleDataPermResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="perm_id", property="permId", jdbcType=JdbcType.BIGINT)
    })
    List<SysRoleDataPerm> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sysRoleDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysRoleDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysRoleDataPerm)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default int insert(SysRoleDataPerm record) {
        return insert(SqlBuilder.insert(record)
                .into(sysRoleDataPerm)
                .map(id).toProperty("id")
                .map(roleId).toProperty("roleId")
                .map(permId).toProperty("permId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default int insertSelective(SysRoleDataPerm record) {
        return insert(SqlBuilder.insert(record)
                .into(sysRoleDataPerm)
                .map(id).toProperty("id")
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(permId).toPropertyWhenPresent("permId", record::getPermId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysRoleDataPerm>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, roleId, permId)
                .from(sysRoleDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysRoleDataPerm>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, roleId, permId)
                .from(sysRoleDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default SysRoleDataPerm selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, roleId, permId)
                .from(sysRoleDataPerm)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SysRoleDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysRoleDataPerm)
                .set(id).equalTo(record::getId)
                .set(roleId).equalTo(record::getRoleId)
                .set(permId).equalTo(record::getPermId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SysRoleDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysRoleDataPerm)
                .set(id).equalToWhenPresent(record::getId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(permId).equalToWhenPresent(record::getPermId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default int updateByPrimaryKey(SysRoleDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysRoleDataPerm)
                .set(roleId).equalTo(record::getRoleId)
                .set(permId).equalTo(record::getPermId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_role_data_perm")
    default int updateByPrimaryKeySelective(SysRoleDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysRoleDataPerm)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(permId).equalToWhenPresent(record::getPermId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
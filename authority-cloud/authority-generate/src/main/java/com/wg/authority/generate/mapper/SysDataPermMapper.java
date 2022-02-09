package com.wg.authority.generate.mapper;

import static com.wg.authority.generate.mapper.SysDataPermDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.generate.entity.SysDataPerm;
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
public interface SysDataPermMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<SysDataPerm> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysDataPermResult")
    SysDataPerm selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysDataPermResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crl_attr_name", property="crlAttrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crl_column_name", property="crlColumnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="perm_code", property="permCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysDataPerm> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sysDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysDataPerm)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default int insert(SysDataPerm record) {
        return insert(SqlBuilder.insert(record)
                .into(sysDataPerm)
                .map(id).toProperty("id")
                .map(name).toProperty("name")
                .map(tableName).toProperty("tableName")
                .map(moduleName).toProperty("moduleName")
                .map(crlAttrName).toProperty("crlAttrName")
                .map(crlColumnName).toProperty("crlColumnName")
                .map(permCode).toProperty("permCode")
                .map(orderNum).toProperty("orderNum")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default int insertSelective(SysDataPerm record) {
        return insert(SqlBuilder.insert(record)
                .into(sysDataPerm)
                .map(id).toProperty("id")
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
                .map(moduleName).toPropertyWhenPresent("moduleName", record::getModuleName)
                .map(crlAttrName).toPropertyWhenPresent("crlAttrName", record::getCrlAttrName)
                .map(crlColumnName).toPropertyWhenPresent("crlColumnName", record::getCrlColumnName)
                .map(permCode).toPropertyWhenPresent("permCode", record::getPermCode)
                .map(orderNum).toPropertyWhenPresent("orderNum", record::getOrderNum)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysDataPerm>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, tableName, moduleName, crlAttrName, crlColumnName, permCode, orderNum, gmtCreate, gmtModified)
                .from(sysDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysDataPerm>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, tableName, moduleName, crlAttrName, crlColumnName, permCode, orderNum, gmtCreate, gmtModified)
                .from(sysDataPerm);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default SysDataPerm selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, tableName, moduleName, crlAttrName, crlColumnName, permCode, orderNum, gmtCreate, gmtModified)
                .from(sysDataPerm)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SysDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysDataPerm)
                .set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(tableName).equalTo(record::getTableName)
                .set(moduleName).equalTo(record::getModuleName)
                .set(crlAttrName).equalTo(record::getCrlAttrName)
                .set(crlColumnName).equalTo(record::getCrlColumnName)
                .set(permCode).equalTo(record::getPermCode)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SysDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysDataPerm)
                .set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(moduleName).equalToWhenPresent(record::getModuleName)
                .set(crlAttrName).equalToWhenPresent(record::getCrlAttrName)
                .set(crlColumnName).equalToWhenPresent(record::getCrlColumnName)
                .set(permCode).equalToWhenPresent(record::getPermCode)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default int updateByPrimaryKey(SysDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysDataPerm)
                .set(name).equalTo(record::getName)
                .set(tableName).equalTo(record::getTableName)
                .set(moduleName).equalTo(record::getModuleName)
                .set(crlAttrName).equalTo(record::getCrlAttrName)
                .set(crlColumnName).equalTo(record::getCrlColumnName)
                .set(permCode).equalTo(record::getPermCode)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_data_perm")
    default int updateByPrimaryKeySelective(SysDataPerm record) {
        return UpdateDSL.updateWithMapper(this::update, sysDataPerm)
                .set(name).equalToWhenPresent(record::getName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(moduleName).equalToWhenPresent(record::getModuleName)
                .set(crlAttrName).equalToWhenPresent(record::getCrlAttrName)
                .set(crlColumnName).equalToWhenPresent(record::getCrlColumnName)
                .set(permCode).equalToWhenPresent(record::getPermCode)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
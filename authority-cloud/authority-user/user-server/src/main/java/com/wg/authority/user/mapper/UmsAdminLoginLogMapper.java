package com.wg.authority.user.mapper;

import static com.wg.authority.user.mapper.UmsAdminLoginLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.user.entity.UmsAdminLoginLog;
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
public interface UmsAdminLoginLogMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<UmsAdminLoginLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsAdminLoginLogResult")
    UmsAdminLoginLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsAdminLoginLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsAdminLoginLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(umsAdminLoginLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsAdminLoginLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, umsAdminLoginLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default int insert(UmsAdminLoginLog record) {
        return insert(SqlBuilder.insert(record)
                .into(umsAdminLoginLog)
                .map(id).toProperty("id")
                .map(adminId).toProperty("adminId")
                .map(createTime).toProperty("createTime")
                .map(ip).toProperty("ip")
                .map(address).toProperty("address")
                .map(userAgent).toProperty("userAgent")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default int insertSelective(UmsAdminLoginLog record) {
        return insert(SqlBuilder.insert(record)
                .into(umsAdminLoginLog)
                .map(id).toProperty("id")
                .map(adminId).toPropertyWhenPresent("adminId", record::getAdminId)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(ip).toPropertyWhenPresent("ip", record::getIp)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(userAgent).toPropertyWhenPresent("userAgent", record::getUserAgent)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsAdminLoginLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, adminId, createTime, ip, address, userAgent)
                .from(umsAdminLoginLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UmsAdminLoginLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, adminId, createTime, ip, address, userAgent)
                .from(umsAdminLoginLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default UmsAdminLoginLog selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, adminId, createTime, ip, address, userAgent)
                .from(umsAdminLoginLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UmsAdminLoginLog record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminLoginLog)
                .set(id).equalTo(record::getId)
                .set(adminId).equalTo(record::getAdminId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(ip).equalTo(record::getIp)
                .set(address).equalTo(record::getAddress)
                .set(userAgent).equalTo(record::getUserAgent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UmsAdminLoginLog record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminLoginLog)
                .set(id).equalToWhenPresent(record::getId)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(userAgent).equalToWhenPresent(record::getUserAgent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default int updateByPrimaryKey(UmsAdminLoginLog record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminLoginLog)
                .set(adminId).equalTo(record::getAdminId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(ip).equalTo(record::getIp)
                .set(address).equalTo(record::getAddress)
                .set(userAgent).equalTo(record::getUserAgent)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: ums_admin_login_log")
    default int updateByPrimaryKeySelective(UmsAdminLoginLog record) {
        return UpdateDSL.updateWithMapper(this::update, umsAdminLoginLog)
                .set(adminId).equalToWhenPresent(record::getAdminId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(userAgent).equalToWhenPresent(record::getUserAgent)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
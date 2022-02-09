package com.wg.authority.generate.mapper;

import static com.wg.authority.generate.mapper.SysUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.generate.entity.SysUser;
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
public interface SysUserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysUser> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysUserResult")
    SysUser selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysUserResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.BIGINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id_create", property="userIdCreate", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sex", property="sex", jdbcType=JdbcType.BIGINT),
        @Result(column="birth", property="birth", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pic_id", property="picId", jdbcType=JdbcType.BIGINT),
        @Result(column="live_address", property="liveAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="hobby", property="hobby", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR)
    })
    List<SysUser> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sysUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default int deleteByPrimaryKey(Long userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysUser)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default int insert(SysUser record) {
        return insert(SqlBuilder.insert(record)
                .into(sysUser)
                .map(userId).toProperty("userId")
                .map(username).toProperty("username")
                .map(name).toProperty("name")
                .map(password).toProperty("password")
                .map(deptId).toProperty("deptId")
                .map(email).toProperty("email")
                .map(mobile).toProperty("mobile")
                .map(status).toProperty("status")
                .map(userIdCreate).toProperty("userIdCreate")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(sex).toProperty("sex")
                .map(birth).toProperty("birth")
                .map(picId).toProperty("picId")
                .map(liveAddress).toProperty("liveAddress")
                .map(hobby).toProperty("hobby")
                .map(province).toProperty("province")
                .map(city).toProperty("city")
                .map(district).toProperty("district")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default int insertSelective(SysUser record) {
        return insert(SqlBuilder.insert(record)
                .into(sysUser)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(deptId).toPropertyWhenPresent("deptId", record::getDeptId)
                .map(email).toPropertyWhenPresent("email", record::getEmail)
                .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(userIdCreate).toPropertyWhenPresent("userIdCreate", record::getUserIdCreate)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(birth).toPropertyWhenPresent("birth", record::getBirth)
                .map(picId).toPropertyWhenPresent("picId", record::getPicId)
                .map(liveAddress).toPropertyWhenPresent("liveAddress", record::getLiveAddress)
                .map(hobby).toPropertyWhenPresent("hobby", record::getHobby)
                .map(province).toPropertyWhenPresent("province", record::getProvince)
                .map(city).toPropertyWhenPresent("city", record::getCity)
                .map(district).toPropertyWhenPresent("district", record::getDistrict)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysUser>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, username, name, password, deptId, email, mobile, status, userIdCreate, gmtCreate, gmtModified, sex, birth, picId, liveAddress, hobby, province, city, district)
                .from(sysUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysUser>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, username, name, password, deptId, email, mobile, status, userIdCreate, gmtCreate, gmtModified, sex, birth, picId, liveAddress, hobby, province, city, district)
                .from(sysUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default SysUser selectByPrimaryKey(Long userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, username, name, password, deptId, email, mobile, status, userIdCreate, gmtCreate, gmtModified, sex, birth, picId, liveAddress, hobby, province, city, district)
                .from(sysUser)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SysUser record) {
        return UpdateDSL.updateWithMapper(this::update, sysUser)
                .set(userId).equalTo(record::getUserId)
                .set(username).equalTo(record::getUsername)
                .set(name).equalTo(record::getName)
                .set(password).equalTo(record::getPassword)
                .set(deptId).equalTo(record::getDeptId)
                .set(email).equalTo(record::getEmail)
                .set(mobile).equalTo(record::getMobile)
                .set(status).equalTo(record::getStatus)
                .set(userIdCreate).equalTo(record::getUserIdCreate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(sex).equalTo(record::getSex)
                .set(birth).equalTo(record::getBirth)
                .set(picId).equalTo(record::getPicId)
                .set(liveAddress).equalTo(record::getLiveAddress)
                .set(hobby).equalTo(record::getHobby)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(district).equalTo(record::getDistrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SysUser record) {
        return UpdateDSL.updateWithMapper(this::update, sysUser)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(name).equalToWhenPresent(record::getName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(userIdCreate).equalToWhenPresent(record::getUserIdCreate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(birth).equalToWhenPresent(record::getBirth)
                .set(picId).equalToWhenPresent(record::getPicId)
                .set(liveAddress).equalToWhenPresent(record::getLiveAddress)
                .set(hobby).equalToWhenPresent(record::getHobby)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(district).equalToWhenPresent(record::getDistrict);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default int updateByPrimaryKey(SysUser record) {
        return UpdateDSL.updateWithMapper(this::update, sysUser)
                .set(username).equalTo(record::getUsername)
                .set(name).equalTo(record::getName)
                .set(password).equalTo(record::getPassword)
                .set(deptId).equalTo(record::getDeptId)
                .set(email).equalTo(record::getEmail)
                .set(mobile).equalTo(record::getMobile)
                .set(status).equalTo(record::getStatus)
                .set(userIdCreate).equalTo(record::getUserIdCreate)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(sex).equalTo(record::getSex)
                .set(birth).equalTo(record::getBirth)
                .set(picId).equalTo(record::getPicId)
                .set(liveAddress).equalTo(record::getLiveAddress)
                .set(hobby).equalTo(record::getHobby)
                .set(province).equalTo(record::getProvince)
                .set(city).equalTo(record::getCity)
                .set(district).equalTo(record::getDistrict)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_user")
    default int updateByPrimaryKeySelective(SysUser record) {
        return UpdateDSL.updateWithMapper(this::update, sysUser)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(name).equalToWhenPresent(record::getName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(deptId).equalToWhenPresent(record::getDeptId)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(userIdCreate).equalToWhenPresent(record::getUserIdCreate)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(birth).equalToWhenPresent(record::getBirth)
                .set(picId).equalToWhenPresent(record::getPicId)
                .set(liveAddress).equalToWhenPresent(record::getLiveAddress)
                .set(hobby).equalToWhenPresent(record::getHobby)
                .set(province).equalToWhenPresent(record::getProvince)
                .set(city).equalToWhenPresent(record::getCity)
                .set(district).equalToWhenPresent(record::getDistrict)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}
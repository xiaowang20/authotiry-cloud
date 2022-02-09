package com.wg.authority.generate.mapper;

import static com.wg.authority.generate.mapper.SysMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wg.authority.generate.entity.SysMenu;
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
public interface SysMenuMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SysMenu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SysMenuResult")
    SysMenu selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SysMenuResult", value = {
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="perms", property="perms", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_num", property="orderNum", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sysMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default int deleteByPrimaryKey(Long menuId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sysMenu)
                .where(menuId, isEqualTo(menuId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default int insert(SysMenu record) {
        return insert(SqlBuilder.insert(record)
                .into(sysMenu)
                .map(menuId).toProperty("menuId")
                .map(parentId).toProperty("parentId")
                .map(name).toProperty("name")
                .map(url).toProperty("url")
                .map(perms).toProperty("perms")
                .map(type).toProperty("type")
                .map(icon).toProperty("icon")
                .map(orderNum).toProperty("orderNum")
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default int insertSelective(SysMenu record) {
        return insert(SqlBuilder.insert(record)
                .into(sysMenu)
                .map(menuId).toPropertyWhenPresent("menuId", record::getMenuId)
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(url).toPropertyWhenPresent("url", record::getUrl)
                .map(perms).toPropertyWhenPresent("perms", record::getPerms)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(icon).toPropertyWhenPresent("icon", record::getIcon)
                .map(orderNum).toPropertyWhenPresent("orderNum", record::getOrderNum)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysMenu>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, menuId, parentId, name, url, perms, type, icon, orderNum, gmtCreate, gmtModified)
                .from(sysMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SysMenu>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, menuId, parentId, name, url, perms, type, icon, orderNum, gmtCreate, gmtModified)
                .from(sysMenu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default SysMenu selectByPrimaryKey(Long menuId_) {
        return SelectDSL.selectWithMapper(this::selectOne, menuId, parentId, name, url, perms, type, icon, orderNum, gmtCreate, gmtModified)
                .from(sysMenu)
                .where(menuId, isEqualTo(menuId_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SysMenu record) {
        return UpdateDSL.updateWithMapper(this::update, sysMenu)
                .set(menuId).equalTo(record::getMenuId)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(url).equalTo(record::getUrl)
                .set(perms).equalTo(record::getPerms)
                .set(type).equalTo(record::getType)
                .set(icon).equalTo(record::getIcon)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SysMenu record) {
        return UpdateDSL.updateWithMapper(this::update, sysMenu)
                .set(menuId).equalToWhenPresent(record::getMenuId)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(perms).equalToWhenPresent(record::getPerms)
                .set(type).equalToWhenPresent(record::getType)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default int updateByPrimaryKey(SysMenu record) {
        return UpdateDSL.updateWithMapper(this::update, sysMenu)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(url).equalTo(record::getUrl)
                .set(perms).equalTo(record::getPerms)
                .set(type).equalTo(record::getType)
                .set(icon).equalTo(record::getIcon)
                .set(orderNum).equalTo(record::getOrderNum)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .where(menuId, isEqualTo(record::getMenuId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sys_menu")
    default int updateByPrimaryKeySelective(SysMenu record) {
        return UpdateDSL.updateWithMapper(this::update, sysMenu)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(perms).equalToWhenPresent(record::getPerms)
                .set(type).equalToWhenPresent(record::getType)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(orderNum).equalToWhenPresent(record::getOrderNum)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .where(menuId, isEqualTo(record::getMenuId))
                .build()
                .execute();
    }
}
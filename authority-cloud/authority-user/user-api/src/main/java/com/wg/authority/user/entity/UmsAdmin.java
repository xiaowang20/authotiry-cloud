package com.wg.authority.user.entity;

import java.util.Date;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_admin
 */
public class UmsAdmin {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.password")
    private String password;

    /**
     * Database Column Remarks:
     *   头像
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.icon")
    private String icon;

    /**
     * Database Column Remarks:
     *   邮箱
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.email")
    private String email;

    /**
     * Database Column Remarks:
     *   昵称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.nick_name")
    private String nickName;

    /**
     * Database Column Remarks:
     *   备注信息
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.note")
    private String note;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.create_time")
    private Date createTime;

    /**
     * Database Column Remarks:
     *   最后登录时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.login_time")
    private Date loginTime;

    /**
     * Database Column Remarks:
     *   帐号启用状态：0->禁用；1->启用
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.username")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.password")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.icon")
    public String getIcon() {
        return icon;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.icon")
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.email")
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.nick_name")
    public String getNickName() {
        return nickName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.nick_name")
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.note")
    public String getNote() {
        return note;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.note")
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.login_time")
    public Date getLoginTime() {
        return loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.login_time")
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: ums_admin.status")
    public void setStatus(Integer status) {
        this.status = status;
    }
}
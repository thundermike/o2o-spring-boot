package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 用户信息实体类
 * @author OovEver
 * @DATE 2017/12/24 20:47
 */
public class PersonInfo {
//    用户ID
    private Long    userId;
    private String  name;
    //    用户头像地址
    private String  profileImg;
    private Date    birthday;
    private String  email;
//    性别
    private String  gender;
//    用户状态，标识用户是否被禁止登陆商城
    private Integer enableStatus;
//    用户类别 1 顾客 2 店家 3 超级管理员
    private Integer userType;
    private Date    createTime;
    private Date    lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

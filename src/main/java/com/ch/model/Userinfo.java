package com.ch.model;

import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {
    private String username;

    private Integer id;

    private String password;

    private String nickname;

    private String userPicture;

    private Integer islogin;

    private Integer isactive;

    private Date lastModeify;

    private Date createDate;

    private String createIp;

    public Userinfo(String username, Integer id, String password, String nickname, String userPicture, Integer islogin, Integer isactive, Date lastModeify, Date createDate, String createIp) {
        this.username = username;
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.userPicture = userPicture;
        this.islogin = islogin;
        this.isactive = isactive;
        this.lastModeify = lastModeify;
        this.createDate = createDate;
        this.createIp = createIp;
    }

    public Userinfo() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture == null ? null : userPicture.trim();
    }

    public Integer getIslogin() {
        return islogin;
    }

    public void setIslogin(Integer islogin) {
        this.islogin = islogin;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Date getLastModeify() {
        return lastModeify;
    }

    public void setLastModeify(Date lastModeify) {
        this.lastModeify = lastModeify;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }
}
package com.ch.model;

import java.util.Date;

/**
 * Created by apple on 2017/4/23.
 */
public class Userinfo {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String userPicture;
    private int islogin;
    private int isactive;
    private Date lastModeify;
    private Date createDate;
    private String createIP;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public int getIslogin() {
        return islogin;
    }

    public void setIslogin(int islogin) {
        this.islogin = islogin;
    }

    public int getIsactive() {
        return isactive;
    }

    public void setIsactive(int isactive) {
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

    public String getCreateIP() {
        return createIP;
    }

    public void setCreateIP(String createIP) {
        this.createIP = createIP;
    }
    public Userinfo(){}

    public Userinfo(long id, String username, String password, String nickname, String userPicture, int islogin, int isactive, Date lastModeify, Date createDate, String createIP) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.userPicture = userPicture;
        this.islogin = islogin;
        this.isactive = isactive;
        this.lastModeify = lastModeify;
        this.createDate = createDate;
        this.createIP = createIP;
    }

}

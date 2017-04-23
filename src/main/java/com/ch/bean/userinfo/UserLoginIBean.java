package com.ch.bean.userinfo;

/**
 * Created by apple on 2017/4/24.
 */
public class UserLoginIBean {
    private String username;
    private String password;

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
    public UserLoginIBean(){}

    public UserLoginIBean(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String toString(){
        return this.getUsername()+this.getPassword();
    }
}

package com.ch.bean;

/**
 * Created by apple on 2017/4/24.
 */
public class OBeanBase {
    private String code;
    private String message;
    private Object contents;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }

    public void setInfo(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public OBeanBase() {
    }
}

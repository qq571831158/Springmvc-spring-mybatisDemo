package com.ch.service;

import com.ch.model.Userinfo;
import sun.jvm.hotspot.debugger.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 2017/4/24.
 */
public interface UserinfoService {

    int deleteByPrimaryKey(String username);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}

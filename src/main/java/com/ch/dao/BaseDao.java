package com.ch.dao;

import com.ch.model.Userinfo;

/**
 * Created by apple on 2017/4/24.
 */
public interface BaseDao<T> {
    int deleteByPrimaryKey(String username);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}

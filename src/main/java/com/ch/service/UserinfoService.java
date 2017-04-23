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
//    public List<Userinfo> findPage(Page page);          //分页查询

    public List<Userinfo> find(Map paraMap);            //待条件查询,条件可以为null,没有条件,返回list对象

    public Userinfo get(Serializable id);               //只查询一个,常用于修改

    public void insert(Userinfo userinfo);              //插入

    public void update(Userinfo userinfo);              //修改

    public void deleteById(Serializable id);            //按id删除一条

    public void delete(Serializable[] ids);             //批量删除
}

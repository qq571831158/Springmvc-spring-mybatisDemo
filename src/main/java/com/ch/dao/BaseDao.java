package com.ch.dao;

import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 2017/4/23.
 */
@Repository
public interface BaseDao<T> {
//    public List<T> findPage(Page page);     //分页查询
    public List<T> find(Map paraMap);       //待条件查询,条件可以为null,没有条件,返回list对象
    public T get(Serializable id);          //只查询一个,常用于修改
    public void insert(T entity);           //插入
    public void update(T entity);           //修改
    public void deleteById(Serializable id); //按id删除一条
    public void delete(Serializable[] ids);  //批量删除
}

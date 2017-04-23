package com.ch.dao.impl;

import com.ch.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 2017/4/23.
 */
@Repository
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    private String ns;    //命名空间

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

//    public List<T> findPage(Page page) {
//        List<T> oList = this.getSqlSession().selectList(ns + ".findPage",page);
//        return  oList;
//    }

    public List<T> find(Map paraMap) {
        return this.getSqlSession().selectList(ns+".selectAll");
    }

    public T get(Serializable id) {
       return this.getSqlSession().selectOne(ns+".selectByPrimaryKey",id);
    }

    public void insert(T entity) {
        this.getSqlSession().insert(ns+".insert",entity);
    }

    public void update(T entity) {
        this.getSqlSession().update(ns+".updateByPrimaryKeySelective",entity);
    }

    public void deleteById(Serializable id) {
        this.getSqlSession().delete(ns+".deleteByPrimaryKey",id);
    }

    public void delete(Serializable[] ids) {
        for (Serializable id:ids){
            this.getSqlSession().delete(ns+".deleteByPrimaryKey",id);
        }

    }
}

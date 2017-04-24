package com.ch.dao.impl;

import com.ch.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by apple on 2017/4/24.
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    private String nameSpace;

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public BaseDaoImpl() {
        super();
    }

    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    public int deleteByPrimaryKey(String username) {
        return 0;
    }

    public int insert(T record) {
        return 0;
    }

    public int insertSelective(T record) {
        return 0;
    }

    public T selectByPrimaryKey(String username) {
        return this.getSqlSession().selectOne(this.getNameSpace() + ".selectByPrimaryKey", username);
    }

    public int updateByPrimaryKeySelective(T record) {
        return 0;
    }

    public int updateByPrimaryKey(T record) {
        return 0;
    }
}

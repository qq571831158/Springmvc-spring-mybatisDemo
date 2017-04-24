package com.ch.service.impl;

import com.ch.dao.UserinfoDao;
import com.ch.model.Userinfo;
import com.ch.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by apple on 2017/4/24.
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    UserinfoDao userinfoDao;

    public UserinfoServiceImpl() {
        super();
    }

    public int deleteByPrimaryKey(String username) {
        return 0;
    }

    public int insert(Userinfo record) {
        return 0;
    }

    public int insertSelective(Userinfo record) {
        return 0;
    }

    public Userinfo selectByPrimaryKey(String username) {
        return userinfoDao.selectByPrimaryKey(username);
    }

    public int updateByPrimaryKeySelective(Userinfo record) {
        return 0;
    }

    public int updateByPrimaryKey(Userinfo record) {
        return 0;
    }
}

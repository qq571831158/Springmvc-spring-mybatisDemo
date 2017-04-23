package com.ch.service.impl;

import com.ch.dao.UserinfoDao;
import com.ch.model.Userinfo;
import com.ch.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by apple on 2017/4/24.
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Resource
    UserinfoDao userinfoDao;

//    public List<Userinfo> findPage(Page page) {
//        return userinfoDao.findPage(page);
//    }

    public List<Userinfo> find(Map paraMap) {
        return userinfoDao.find(paraMap);
    }

    public Userinfo get(Serializable id) {
        return userinfoDao.get(id);
    }

    public void insert(Userinfo userinfo) {

    }

    public void update(Userinfo userinfo) {

    }

    public void deleteById(Serializable id) {

    }

    public void delete(Serializable[] ids) {

    }
}

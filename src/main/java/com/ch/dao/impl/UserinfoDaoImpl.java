package com.ch.dao.impl;

import com.ch.dao.UserinfoDao;
import com.ch.model.Userinfo;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2017/4/24.
 */
@Repository
public class UserinfoDaoImpl extends BaseDaoImpl<Userinfo> implements UserinfoDao {
    public UserinfoDaoImpl() {
        super.setNameSpace("com.ch.mapping.UserinfoMapper");
    }
}

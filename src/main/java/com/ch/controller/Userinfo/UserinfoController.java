package com.ch.controller.Userinfo;

import com.ch.bean.OBeanBase;
import com.ch.bean.userinfo.UserLoginIBean;
import com.ch.model.Userinfo;
import com.ch.service.UserinfoService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * Created by apple on 2017/4/24.
 */
@Controller
@RequestMapping(value = "/user")
public class UserinfoController {
    @Resource
    UserinfoService userinfoService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public OBeanBase doLogin(@RequestBody UserLoginIBean userLoginIBean) {
        Logger logger = Logger.getLogger("DAO");
        OBeanBase carrier = new OBeanBase();
        Userinfo userinfo = userinfoService.selectByPrimaryKey(userLoginIBean.getUsername());
        if (userinfo != null) {
            if (userinfo.getPassword().equals(userLoginIBean.getPassword())) {
                System.out.println(userinfo.getNickname());
                carrier.setInfo("S01", "登录成功");
                logger.debug("登录成功");
                carrier.setContents(userinfo);
            } else {
                carrier.setInfo("E01", "密码错误");
            }
        } else {
            carrier.setInfo("E03", "无此账号");
        }
        return carrier;
    }
}

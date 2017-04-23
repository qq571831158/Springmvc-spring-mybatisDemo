package com.ch.controller.Userinfo;

import com.ch.bean.userinfo.UserLoginIBean;
import com.ch.model.Userinfo;
import com.ch.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by apple on 2017/4/24.
 */
@Controller
@RequestMapping(value = "/user")
public class UserinfoController {
    @Resource
    UserinfoService userinfoService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(@RequestParam("username") String username,@RequestParam("password") String password ,Model model){
        Userinfo userinfo = userinfoService.get(username);
        System.out.println(userinfo.getNickname());
        if (userinfo!=null){
            if (userinfo.getPassword().equals(password)){
                model.addAttribute("userinfo",userinfo);
                return "success";
            }
            return "fail";
        }
        else {
            return "fail";
        }

    }
}

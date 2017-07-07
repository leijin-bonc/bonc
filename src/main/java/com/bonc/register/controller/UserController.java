/*
 * 文件名：UserController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月6日
 */

package com.bonc.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bonc.register.service.UserService;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月6日
 * @see UserController
 * @since
 */
@Controller
public class UserController{
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    
    @RequestMapping(value = {"/"})
    public String addUser(){
        System.out.println("进入控制层");
        userService.addUser();
        return "index";
    }
    
    @RequestMapping(value = {"/u/login"},method = RequestMethod.GET)
    public String logintest(String username,String password){
        String str = userService.login(username,password);
        if (str.equals("1")){
            return "admin";
        } else {
            return "noUser";
        }
            
    }
    
    @RequestMapping(value = {"/admin/add"})
    @ResponseBody
    public String adminAdd(String username,String password){
        String desult = userService.adminAddUser(username, password);
        return JSON.toJSONString(desult);
    }
    
    @RequestMapping(value = {"/admin/delete"})
    @ResponseBody
    public String adminDelete(String username,String password){
        String desult = userService.adminDeleteUser(username, password);
        return JSON.toJSONString(desult);
    }
    
}

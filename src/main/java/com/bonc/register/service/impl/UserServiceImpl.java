/*
 * 文件名：UserServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月6日
 */

package com.bonc.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bonc.register.dao.UserDao;
import com.bonc.register.entity.User;
import com.bonc.register.service.UserService;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月6日
 * @see UserServiceImpl
 * @since
 */

@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDao userDao;
    
    /**
     * 默认添加用户
     */
    public void addUser(){
        User user1 = new User(1111,"雷进","123456");
        userDao.save(user1);
    }
    
    /**
     * 登录判断
     */
    public String login(String username,String password){
        User user;
        user = userDao.findByUsernameAndPassword(username, password);
        if (null == user){
            System.out.println("没有该用户");
            return "0";
        } else {
            System.out.println("欢迎" + user.getUsername());
            return "1";
        }
    }
    
    /**
     * 增加用户
     */
    public String adminAddUser(String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userDao.save(user);
        return username + "用户添加成功！";
    }
    
    
    /**
     * 删除用户
     */
    public String adminDeleteUser(String username,String password){
        User user;
        user = userDao.findByUsernameAndPassword(username, password);
        if (null == user){
            return "没有该用户，不能删除!";
        } else {
            userDao.delete(user);
            return username + "删除成功！";
        }
    }
    
    

   
}

/*
 * 文件名：UserService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月6日
 */

package com.bonc.register.service;

import com.bonc.register.entity.User;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月6日
 * @see UserService
 * @since
 */

public interface UserService{
    void addUser();
    
    String login(String username,String password);
    
    String adminAddUser(String username,String password);
    
    String adminDeleteUser(String username,String password); 
}

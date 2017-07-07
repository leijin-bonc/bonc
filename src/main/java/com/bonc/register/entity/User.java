/*
 * 文件名：User.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月6日
 */

package com.bonc.register.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月6日
 * @see User
 * @since
 */

@Entity
public class User{
    
    /**
     * 用户id
     */
    @Id
    private int id;
    
    /**
     * 用户名
     */
    private String username;
    
    /**
     * 密码
     */
    private String password;
    
    /**
     * 构造方法
     * @param id
     * @param username
     * @param password
     */
    public User(){
        
    }
    
    public User(int id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
}

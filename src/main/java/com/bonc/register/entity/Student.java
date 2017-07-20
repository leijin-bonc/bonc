/*
 * 文件名：Student.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月18日
 */

package com.bonc.register.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
     * Name
     */
    private String name;
    
    /**
     * Sex
     */
    private String sex;
    
    /**
     * Birth
     */
    private Date birth;
    
    
    /**
     * 院系:Department
     */
    private String department;
    
    /**
     * 家庭住址:Address
     */
    private String address;
    
    
    
    //构造方法
    public Student(){
        
    }
    
    public Student(Integer id,String name,String sex,Date birth,String department,String address){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.department = department;
        this.address = address;
    }
    
    
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    
    
    
    public void setBirth(Date birth){
        this.birth = birth;
    }
    public Date getBirth(){
        return birth;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    
}



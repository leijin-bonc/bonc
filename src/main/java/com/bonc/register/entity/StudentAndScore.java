/*
 * 文件名：StudentAndScore.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月20日
 */

package com.bonc.register.entity;

import java.sql.Date;

public class StudentAndScore{
    private Integer stu_id;
    private String name;
    private String sex;
    private Date birth;
    private String department;
    private String address;
    private String CName;
    private int grade;
    
    public StudentAndScore(){
        
    }
    
    public StudentAndScore(Integer stu_id,String name,String sex,Date birth,
                           String department,String address,String CName,int grade){
        this.stu_id = stu_id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.department = department;
        this.address = address;
        this.CName = CName;
        this.grade = grade;
    }

    public Integer getStu_id()
    {
        return stu_id;
    }

    public void setStu_id(Integer stu_id)
    {
        this.stu_id = stu_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Date getBirth()
    {
        return birth;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCName()
    {
        return CName;
    }

    public void setCName(String cName)
    {
        CName = cName;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    
}

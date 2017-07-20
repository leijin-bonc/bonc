/*
 * 文件名：Score.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月18日
 */

package com.bonc.register.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月18日
 * @see Score
 * @since
 */
@Entity
@Table(name = "Score")
public class Score{
    
    /**
     * 编号：id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
     * 学号:stu_id
     */
    private Integer stuId;
    
    /**
     * 课程名：C_name
     */
    private String CName;
    
    /**
     * 分数:grade
     */
    private int grade;
    
    public Score(){
        
    }
    
    public Score(Integer id,Integer stuId,String CName,int grade){
        this.id = id;
        this.stuId = stuId;
        this.CName = CName;
        this.grade = grade;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    
    public void setStuId(Integer stuId){
        this.stuId = stuId;
    }
    public Integer getStuId(){
        return stuId;
    }
    
    public void setCName(String CName){
        this.CName = CName;
    }
    public String getCName(){
        return CName;
    }
    
    public void setScore(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
  
}

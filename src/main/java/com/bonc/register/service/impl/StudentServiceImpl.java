/*
 * 文件名：StudentServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月18日
 */

package com.bonc.register.service.impl;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bonc.register.dao.StudentDao;
import com.bonc.register.entity.Student;
import com.bonc.register.service.StudentService;


@Service("studentService")
public class StudentServiceImpl implements StudentService{
   
    @Autowired
    StudentDao studentDao;
    
    public void addStudent(){
        Student student1 = new Student(901,"张老大","男",new Date(1985),"计算机系", "北京市海淀区");
        studentDao.save(student1);
        Student student2 = new Student(902,"张老二", "男",new Date(1986),"中文系", "北京市昌平区");
        studentDao.save(student2);
        Student student3 = new Student(903,"张三", "女",new Date(1990),"中文系", "湖南省永州市");
        studentDao.save(student3);
        Student student4 = new Student(904,"李四", "男",new Date(1990),"英语系", "辽宁省阜新市");
        Student student5 = new Student(905,"王五", "女",new Date(1991),"英语系", "福建省厦门市");
        Student student6 = new Student(906,"王六", "男",new Date(1988),"计算机系", "湖南省衡阳市");
        studentDao.save(student4);
        studentDao.save(student5);
        studentDao.save(student6);
    }
    
    public List<Student> getAllStudent(){
        List<Student> listStudent = studentDao.findAll();
        return listStudent;
    }
    
    public List<Student> getLimitStu(){
        List<Student> listStudent = studentDao.findLimitStudent(2, 2);
        return listStudent;
    }
    
    public List<Student> getInStu(){
        List<Student> listStudent = studentDao.findInStudent("计算机系", "英语系");
        return listStudent;
    }
    
    public String getScoreAndStu(){
        Object[][] object = studentDao.findScoreAndStudent();
        Map<String,Object> map = new HashMap<String,Object>();
        String totalJsonString = "";
        for (int i = 0;i < object.length;i ++){
            map.put("stu_id", object[i][0]);
            map.put("name", object[i][1]);
            map.put("sex", object[i][2]);
            map.put("birth", object[i][3]);
            map.put("department", object[i][4]);
            map.put("address", object[i][5]);
            map.put("CName", object[i][6]);
            map.put("grade", object[i][7]); 
            String jsonString = JSON.toJSONString(map);
            totalJsonString = totalJsonString + jsonString;
        }
        
        System.out.println(totalJsonString);
        return totalJsonString;
    }
}

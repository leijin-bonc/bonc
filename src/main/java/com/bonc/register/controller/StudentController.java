/*
 * 文件名：StudentController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月19日
 */

package com.bonc.register.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bonc.register.entity.Student;
import com.bonc.register.entity.StudentAndScore;
import com.bonc.register.service.StudentService;

/**
 * 控制层
 * @author Jingege
 * @version 2017年7月20日
 * @see StudentController
 * @since
 */
@Controller
public class StudentController{
    
    /**
     * 
     */
    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;
    
    /**
     * @return json
     * @see
     */
    @RequestMapping(value = {"/addStudent"})
    @ResponseBody
    public String addStudent(){
        studentService.addStudent();
        return JSON.toJSONString("");
    }
    
    /**
     * Description: <br>
     * 1、返回界面<br>
     * @return showStuent
     * @see
     */
    @RequestMapping(value = {"/showStudent"})
    public String showStuent(){
        return "showStudent";
    }
    
    /**
     * Description: <br>
     * 1查询所有的学生<br>
     * @return json
     * @see
     */
    @RequestMapping(value = {"/showStudentTest"})
    @ResponseBody
    public JSON showStudentTest(){
        List<Student> listStudent = studentService.getAllStudent();
        JSON json = (JSON)JSON.toJSON(listStudent);
        String jsonString = JSON.toJSONString(listStudent);
        System.out.println(jsonString);
        return json;
        //return JSON.toJSONString(listStudent);
    }
    
    /**
     * Description: <br>
     * 1、向ajax返回第2到4行的学生<br>
     * @return json
     * @see
     */
    @RequestMapping(value = {"/findLimitStu"})
    @ResponseBody
    public JSON findLimitStu(){
        List<Student> listStudent = studentService.getLimitStu();
        JSON json = (JSON)JSON.toJSON(listStudent);
        return json;
    }
    
    @RequestMapping(value = {"/findInStu"})
    @ResponseBody
    public JSON findInStu(){
        List<Student> listStudent = studentService.getInStu();
        JSON json = (JSON)JSON.toJSON(listStudent);
        return json;
    }
    
    @RequestMapping(value = {"/findScoreAndStu"})
    @ResponseBody
    public String findScoreAndStu(){
        String jsonString = studentService.getScoreAndStu();
        return jsonString;
    }
    
}

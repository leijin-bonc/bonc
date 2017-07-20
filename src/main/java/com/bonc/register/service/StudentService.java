/*
 * 文件名：StudentService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月18日
 */

package com.bonc.register.service;

import java.util.List;

import com.bonc.register.entity.Student;
import com.bonc.register.entity.StudentAndScore;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月18日
 * @see StudentService
 * @since
 */

public interface StudentService{
    /**
     * Description: <br>
     * 1添加学生<br> 
     * @see
     */
    void addStudent();
    
    /**
     * 
     * Description: <br>
     * 1、查询所有学生<br>
     * @return List<Student>
     * @see
     */
    List<Student> getAllStudent();
    
    /**
     * Description: <br>
     * 1、查询第2到4行的学生<br>
     * @return List<Student>
     * @see
     */
    List<Student> getLimitStu();
    
    List<Student> getInStu();
    
    String getScoreAndStu();
}

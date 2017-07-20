/*
 * 文件名：StudentDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：Jingege
 * 修改时间：2017年7月18日
 */

package com.bonc.register.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bonc.register.entity.Student;

/**
 * 
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Jingege
 * @version 2017年7月20日
 * @see StudentDao
 * @since
 */
public interface StudentDao extends JpaRepository<Student,Long>{
    
    
     /**
      * 查询所有学生
      * @return list
      */
    List<Student> findAll();
    
    /**
     * @param start
     * @param number
     * @return list
     * @see
     */
    @Query(value = "select * from student limit ?,?",nativeQuery = true)
    List<Student> findLimitStudent(int start,int number);
    
    /**
     * Description: <br>
     * 1、查询某几个系的学生<br>
     * @param deaprt1
     * @param depart2
     * @return list
     * @see
     */
    @Query(value = "select * from student where department in (?,?)",nativeQuery = true)
    List<Student> findInStudent(String deaprt1,String depart2);
    
    @Query(value = "select stu_id,name,sex,birth,department,address,CName,grade"
        + " from student,score where student.id = score.stu_id",nativeQuery = true)
    Object[][] findScoreAndStudent();
}




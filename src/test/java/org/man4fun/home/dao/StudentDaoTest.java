package org.man4fun.home.dao;


import org.junit.Test;
import org.junit.Assert;
import org.man4fun.base.BaseTest;
import org.man4fun.home.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDaoTest extends BaseTest{
    @Autowired
    private StudentDaoImpl<Student> studentDao;

    @Test
    public void Test (){
//        Student laiKe = new Student("莱克", 12);
//        Assert.assertTrue("插入失败", studentDao.insert(laiKe));
        Student student = studentDao.getStudentByAge(19);
        System.out.println(student.getName());
    }

}

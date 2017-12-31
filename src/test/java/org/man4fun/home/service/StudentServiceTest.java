package org.man4fun.home.service;


import org.junit.Test;
import org.man4fun.base.BaseTest;
import org.man4fun.home.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceTest extends BaseTest{
    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        Student student = studentService.doSomeBusinessStuff(19);
        System.out.println(student.getName());
    }
}

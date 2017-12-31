package org.man4fun.home.service;

import org.man4fun.home.mapper.StudentMapper;
import org.man4fun.home.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentMapper studentMapper;


    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

//    @Override
//    public void setStudentMapper(StudentMapper studentMapper) {
//        this.studentMapper = studentMapper;
//    }

    @Override
    public Student doSomeBusinessStuff(int age) {
        return this.studentMapper.getStudent(age);
    }

}

package org.man4fun.home.service;

import org.man4fun.home.mapper.StudentMapper;
import org.man4fun.home.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
//    void setStudentMapper(StudentMapper studentMapper);
    Student doSomeBusinessStuff(int age);
}

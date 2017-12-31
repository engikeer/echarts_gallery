package org.man4fun.home.dao;

import org.man4fun.home.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao<T extends Student> extends BaseDao<T> {
    public Student getStudentByAge(int age);
}

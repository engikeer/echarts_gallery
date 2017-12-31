package org.man4fun.home.mapper;

import org.apache.ibatis.annotations.Select;
import org.man4fun.home.pojo.Student;

public interface Mapper {
//    @Select("SELECT * FROM student WHERE age = #{age}")
    public Student getStudentByAge(int age);
}

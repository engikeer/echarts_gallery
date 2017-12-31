package org.man4fun.home.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.man4fun.home.pojo.Student;


public interface StudentMapper {
    @Select("SELECT * FROM student WHERE age = #{age}")
    Student getStudent(@Param("age") int age);
}

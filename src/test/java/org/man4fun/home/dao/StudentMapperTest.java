package org.man4fun.home.dao;

import org.junit.Test;
import org.man4fun.base.BaseTest;
import org.man4fun.home.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class StudentMapperTest extends BaseTest{

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private StudentMapper studentMapper;


    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void selectByExample() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        Student student = studentMapper.selectByPrimaryKey(210);
        student.toString();
        assertEquals("早瀬みる", student.getName());
    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

}
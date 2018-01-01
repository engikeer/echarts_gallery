package org.man4fun.home.dao;

import org.junit.Test;
import org.man4fun.base.BaseTest;
import org.man4fun.home.model.Student;
import org.man4fun.home.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;


public class StudentMapperTest extends BaseTest{

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private StudentMapper studentMapper;


    @Test
    public void deleteByPrimaryKey() throws Exception {
        // 删除前先查询，保证删除条件正确
        Student student = studentMapper.selectByPrimaryKey(313);
        System.out.println(student.getName());
        assertEquals(1, studentMapper.deleteByPrimaryKey(313));
    }


    @Test
    public void insert() throws Exception {
        Student laozi = new Student();
        laozi.setName("老子");
        laozi.setAge(93);

        int nRow = studentMapper.insert(laozi);
        assertEquals(1, nRow);


    }

    @Test
    public void selectByExample() throws Exception {
        StudentExample studentExample = new StudentExample();
        // 创建条件
        StudentExample.Criteria criteria = studentExample.createCriteria();
        // 添加条件
        criteria.andAgeBetween(28, 30);

        List<Student> studentList = studentMapper.selectByExample(studentExample);
        assertEquals(30, studentList.size());

    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        Student student = studentMapper.selectByPrimaryKey(210);
        assertEquals("早瀬みる", student.getName());
    }


    @Test
    public void updateByPrimaryKey() throws Exception {
        // 普通update更新所有字段，先获取对象再更新保证没有空值
        Student student  = studentMapper.selectByPrimaryKey(311);
        student.setAge(55);
        assertEquals(1, studentMapper.updateByPrimaryKey(student));
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
        // 批量更新使用条件更新。不需要先查询，直接构建数据模型即可
    }

}
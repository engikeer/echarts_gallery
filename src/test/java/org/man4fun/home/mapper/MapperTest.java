package org.man4fun.home.mapper;


import org.junit.Before;
import org.junit.Test;
import org.man4fun.base.BaseTest;
import org.man4fun.home.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest extends BaseTest{
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-servlet.xml");
    }

    @Test
    public void test() {
        Mapper mapper = (Mapper) applicationContext.getBean("mapper");
        Student student = mapper.getStudentByAge(19);
        System.out.println(student.getName());
    }

}

package org.man4fun.home.dao;

import org.junit.Test;
import org.man4fun.base.BaseTest;
import org.man4fun.home.model.CustomerExample;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerMapperTest extends BaseTest{
    @Autowired
    private CustomerMapper customerMapper;


    @Test
    public void testCount() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustCountryEqualTo("USA");
        long count = customerMapper.countByExample(customerExample);
        assertEquals(5L, count);
    }
}

package org.man4fun.home.controller;

import com.google.gson.Gson;
import org.junit.Test;
import org.man4fun.home.BaseTest;

import org.springframework.beans.factory.annotation.Autowired;


public class BaseControllerTest extends BaseTest {
    @Autowired
    private BaseController baseController;

    private Gson gson = new Gson();


    @Test
    public void Test() {
        System.out.println(gson.toJson(baseController.getOption()));
    }

}

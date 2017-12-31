package org.man4fun.home.controller;

import org.man4fun.home.service.LineService;
import org.man4fun.utils.echarts.Option;

import com.google.gson.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BaseController {
    private Gson gson = new Gson();
    private LineService lineService;

    @Autowired
    public BaseController(LineService lineService) {
        this.lineService = lineService;
    }

    @RequestMapping(value = "/admin.do")
    @ResponseBody
    public String testSpring() {

        Logger logger  = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.error("error level");
        logger.fatal("fatal level");

        return "My Admin String";
    }

    @RequestMapping(value = "/getOption.do", produces="application/json; charset=UTF-8")
    @ResponseBody
    public String getOption() {
        Option option = lineService.getOption();
        return gson.toJson(option);
    }
}

package org.man4fun.home.controller;

import lombok.extern.log4j.Log4j2;
import org.man4fun.home.service.LineService;
import org.man4fun.utils.echarts.Option;

import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Log4j2
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
        log.trace("trace level");
        log.debug("debug level");
        log.info("info level");
        log.warn("warn level");
        log.error("error level");
        log.fatal("fatal level");

        return "My Admin String";
    }

    @RequestMapping(value = "/getOption.do", produces="application/json; charset=UTF-8")
    @ResponseBody
    public String getOption() {
        Option option = lineService.getOption();
        return gson.toJson(option);
    }
}

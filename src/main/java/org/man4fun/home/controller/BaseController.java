package org.man4fun.home.controller;

import lombok.extern.log4j.Log4j2;
import org.man4fun.home.model.Goods;
import org.man4fun.home.service.LineService;
import org.man4fun.utils.echarts.Option;

import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @RequestMapping(value = "/getBaseBarData.do")
    @ResponseBody
    public String getBaseBarData() {
//        var data = [{'name': '衬衫', 'value': 5},
//        {'name': '羊毛衫', value: 20},
//        {'name': '雪纺衫', value: 36},
//        {'name': '裤子', value: 10},
//        {'name': '高跟鞋', value: 10},
//        {'name': '袜子', value: 20}];

        Goods g1 = new Goods("衬衫", 5);
        Goods g2 = new Goods("羊毛衫", 20);
        Goods g3 = new Goods("雪纺衫", 36);
        Goods g4 = new Goods("裤子", 10);
        Goods g5 = new Goods("高跟鞋", 10);
        Goods g6 = new Goods("袜子", 20);

        List<Goods> goods = new ArrayList<>();
        goods.add(g1);
        goods.add(g2);
        goods.add(g3);
        goods.add(g4);
        goods.add(g5);
        goods.add(g6);
        String[] legend = {"销量"};

        Map<String, Object> data = new HashMap<>();
        data.put("goods", goods);
        data.put("legend", legend);

        return gson.toJson(data);
    }
}

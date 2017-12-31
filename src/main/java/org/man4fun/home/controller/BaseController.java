package org.man4fun.home.controller;

import com.google.gson.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.man4fun.utils.echarts.axis.CategoryAxis;
import org.man4fun.utils.echarts.axis.ValueAxis;
import org.man4fun.utils.echarts.code.Magic;
import org.man4fun.utils.echarts.code.Tool;
import org.man4fun.utils.echarts.code.Trigger;
import org.man4fun.utils.echarts.feature.MagicType;
import org.man4fun.utils.echarts.json.GsonOption;
import org.man4fun.utils.echarts.series.Line;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BaseController {
    Gson gson = new Gson();

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
        GsonOption option = new GsonOption();
        option.legend("高度(km)与气温(°C)变化关系");

        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar),
                Tool.restore,
                Tool.saveAsImage);

        option.calculable(true);
        option.tooltip().trigger(Trigger.axis).formatter("Temperature : <br/>{b}km : {c}°C");

        ValueAxis valueAxis = new ValueAxis();
        valueAxis.axisLabel().formatter("{value} °C");
        option.xAxis(valueAxis);

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.axisLine().onZero(false);
        categoryAxis.axisLabel().formatter("{value} km");
        categoryAxis.boundaryGap(false);
        categoryAxis.data(0, 10, 20, 30, 40, 50, 60, 70, 80);
        option.yAxis(categoryAxis);

        Line line = new Line();
        line.smooth(true).name("高度(km)与气温(°C)变化关系")
                .data(15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5)
                .itemStyle().normal().lineStyle().shadowColor("rgba(0,0,0,0.4)");
        option.series(line);
        return gson.toJson(option);
    }
}

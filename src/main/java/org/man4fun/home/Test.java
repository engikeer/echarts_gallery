package org.man4fun.home;


import org.man4fun.utils.echarts.axis.CategoryAxis;
import org.man4fun.utils.echarts.axis.ValueAxis;
import org.man4fun.utils.echarts.code.Magic;
import org.man4fun.utils.echarts.code.PointerType;
import org.man4fun.utils.echarts.code.Tool;
import org.man4fun.utils.echarts.code.Trigger;
import org.man4fun.utils.echarts.feature.MagicType;
import org.man4fun.utils.echarts.json.GsonOption;
import org.man4fun.utils.echarts.series.Bar;

public class Test {

    public static void main(String[] args) {
        GsonOption option = new GsonOption();
        option.tooltip().trigger(Trigger.axis).axisPointer().type(PointerType.shadow);
        option.legend("直接访问", "邮件营销", "联盟广告", "视频广告", "搜索引擎");
        option.toolbox().show(true).feature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar).show(true), Tool.restore, Tool.saveAsImage);
        option.calculable(true);
        option.yAxis(new CategoryAxis().data("周一", "周二", "周三", "周四", "周五", "周六", "周日"));
        option.xAxis(new ValueAxis());

        Bar bar = new Bar("直接访问");
        bar.stack("总量");
        bar.itemStyle().normal().label().show(true).position("insideRight");
        bar.data(320, 302, 301, 334, 390, 330, 320);

        Bar bar2 = new Bar("邮件营销");
        bar2.stack("总量");
        bar2.itemStyle().normal().label().show(true).position("insideRight");
        bar2.data(320, 302, 301, 334, 390, 330, 320);

        Bar bar3 = new Bar("联盟广告");
        bar3.stack("总量");
        bar3.itemStyle().normal().label().show(true).position("insideRight");
        bar3.data(120, 132, 101, 134, 90, 230, 210);

        Bar bar4 = new Bar("视频广告");
        bar4.stack("总量");
        bar4.itemStyle().normal().label().show(true).position("insideRight");
        bar4.data(150, 212, 201, 154, 190, 330, 410);

        Bar bar5 = new Bar("搜索引擎");
        bar5.stack("总量");
        bar5.itemStyle().normal().label().show(true).position("insideRight");
        bar5.data(820, 832, 901, 934, 1290, 1330, 1320);

        option.series(bar, bar2, bar3, bar4, bar5);
        option.exportToHtml("bar4.html");
        String st = option.toString();
        option.view();
    }

}

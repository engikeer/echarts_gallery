$(document).ready(function() {
    var dom = $('#main')[0];
    var myChart = echarts.init(dom, 'dark');

    /**
     * @param data.goods        List of goods
     * @param data.goods.sales  Sales of the item
     */
    $.getJSON('/getBaseBarData.do', function(data) {

        // var data = [{'name': '衬衫', 'value': 5},
        //     {'name': '羊毛衫', value: 20},
        //     {'name': '雪纺衫', value: 36},
        //     {'name': '裤子', value: 10},
        //     {'name': '高跟鞋', value: 10},
        //     {'name': '袜子', value: 20}];

        var goods = data.goods;
        var legend = data.legend;
        var names = [];
        var values = [];
        for (var i = 0;i < goods.length; i++) {
            names.push(goods[i].name);
            values.push(goods[i].sales);
        }

        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            legend: {
                data:legend
            },
            xAxis: {
                data: names
            },
            yAxis: {},
            tooltip: {},
            toolbox: {
                feature: {
                    saveAsImage: {},
                    dataZoom: {},
                    magicType: {
                        type: ['line', 'bar']
                    }
                }
            },
            series: [{
                name: legend,
                type: 'bar',
                data: values
            }]
        };
        myChart.setOption(option);
    });




});
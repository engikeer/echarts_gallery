$(document).ready(function(){

    var option = {};
    $.ajaxSettings.async = false;
    $.getJSON('/getOption.do', function(data){
        option = data;
    });

    var myChart = echarts.init($('#main')[0], 'dark');
    myChart.setOption(option);

});
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/echarts.common.min.js"></script>
</head>
<body>
	<div id="chartmain" style="width:600px; height: 400px;"></div>
	<div id="chartmain1" style="width:600px; height: 400px;"></div>
	<script type="text/javascript">
        //指定图标的配置和数据
        var option = {
            title:{
                text:'ECharts 数据统计'
            },
            tooltip:{
            	show:true,
            	feature:{
                    magicType:{type:['pie','bar']},
                    restore:{},
                    saveAsImage:{},
                    dataZoom:{
                        show:true,
                        xAxisIndex:[0,3]
                    },
             	}
            },
            legend:{
                data:['访问量','用户量']
            },
            xAxis:{
                data:["Android","IOS","PC","Ohter"]
            },
            yAxis:{

            },
            series:[{
                name:'访问量',
                type:'line',
                data:[500,200,360,100]
            }
            ,
            {
                name:'用户量',
                type:'line',
                data:[125,330,230,60]
            }]
        };
        //初始化echarts实例
        var myChart = echarts.init(document.getElementById('chartmain'));

        //使用制定的配置项和数据显示图表
        myChart.setOption(option);
        
        
        var option1 = {
                title:{
                    text:'ECharts 数据统计'
                },            
                series:[{
                    name:'访问量',
                    type:'pie',    
                    radius:'60%', 
                    data:[
                        {value:500,name:'Android'},
                        {value:200,name:'IOS'},
                        {value:360,name:'PC'},
                        {value:100,name:'Ohter'}
                    ]
                }]
            };
        //初始化echarts实例
        var myChart = echarts.init(document.getElementById('chartmain1'));

        //使用制定的配置项和数据显示图表
        myChart.setOption(option1);
    </script>
</body>
</html>
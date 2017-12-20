package ws.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * @author gacl
 *
 * 发布Web Service
 */
public class WebServicePublish {

    public static void main(String[] args) {
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	    Calendar c = Calendar.getInstance();    
	    c.add(Calendar.MONTH, 0);
	    c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
	    String first = df.format(c.getTime());
	    System.out.println("===============first:"+first);
    }
}
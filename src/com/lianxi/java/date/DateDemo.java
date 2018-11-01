package com.lianxi.java.date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
	public static void main(String[] args) { 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
	    // 初始化 Date 对象
	     Date date = new Date();
	     // 使用toString()显示日期和时间
	     String str = String.format("Current Date/Time : %tc", date );
	     System.out.printf(str);
		
	}
}

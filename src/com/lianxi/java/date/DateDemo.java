package com.lianxi.java.date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
	public static void main(String[] args) { 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		
	    // ��ʼ�� Date ����
	     Date date = new Date();
	     // ʹ��toString()��ʾ���ں�ʱ��
	     String str = String.format("Current Date/Time : %tc", date );
	     System.out.printf(str);
		
	}
}

package com.lianix.Scan.Array.BZL;

public class BaoZhuangLei {

	public static void main(String[] args) {
//		小的     short 
//		大的     int
//		Double是double的包装类    包装类有实用的方法 常量         
//		方法string->byte  10-16/2/8
//		常量     integer.MIN_VALUES  
//			 integer.MAX_VALUES  
//		     integer.parseInt(String sInterger)   parse  解析的意思  把对应的字符串转换成整形       字符串 -》 整形
//		     integer.toBinaryString(int value)  10 -》 2返回String类型
//		     integer.toHexString(int value)  10 -》 16返回String类型
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("108") + 10);// 字符串转化为Byte

		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("108") + 2);// 字符串转化为整形

		System.out.println(Integer.toBinaryString(16)); // 10 -> 2
		System.out.println(Integer.toHexString(16));// 10 ->16
		System.out.println(Integer.toOctalString(16));// 10 ->8
	}

}

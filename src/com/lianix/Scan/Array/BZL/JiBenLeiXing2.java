package com.lianix.Scan.Array.BZL;

//Ctrl+Shit+O去掉多余的包
public class JiBenLeiXing2 {
	public static void main(String[] args) {
//		局部变量 全局变量
////		test01
//		{
//         //		变量的作用域
//			String name = "张飞";
//			System.out.println(name);
//		}//代码块 局部name 被JVM虚拟机回收
		
//		String name = "王妃";
//		System.out.println(name);
		
//		test02
		String name = "张飞";
		System.out.println(name);
		{
			String name1 = "王妃"; // 张飞在test02的main方法内都有效
			System.out.println(name1);
		}
	}
}

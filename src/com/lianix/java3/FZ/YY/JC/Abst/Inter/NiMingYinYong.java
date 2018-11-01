package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class NiMingYinYong {

	public static void main(String[] args) {
		System.out.println("====匿名类 只有一次====");
		new Student().tell();//匿名类 只有一次  Hello
		System.out.println();

		//		引用传递
		System.out.println("引用传递");
		System.out.println("====修改Student类里面的temp的值=====");
		Student student1 = new Student();
		System.out.println("初始: "+student1.temp);
		student1.temp = 20;
		System.out.println("修改一: "+student1.temp);
		tell(student1);
		System.out.println("修改二: "+student1.temp);
		System.out.println();
		
		System.out.println("====修改main方法里的str=======");
		String str = "Hello1";//String 不可变 //修改main方法里的str
		System.out.println(str);
		telll(str);
		System.out.println(str);
		System.out.println();
		
		System.out.println("======修改Student类里面的a======");
		student1.a = "Hello22222222222222222";//修改Student里面的a
		System.out.println(student1.a);//重新开辟了空间
		tell2(student1);
		System.out.println(student1.a);//再次更改
	}
	public static void tell(Student student2) {//静态方法 不能调用非静态的属性和方法
		student2.temp = 30;
	}
	public static void telll(String str1) {
		str1 = "jike1";
	}
	public static void tell2(Student b) {
		b.a = "jike2";
	}
}
class Student{
	public  void tell() {
		System.out.println("匿名类 Hello");
	}
	int temp = 10;

	String a = "Hello2";
}
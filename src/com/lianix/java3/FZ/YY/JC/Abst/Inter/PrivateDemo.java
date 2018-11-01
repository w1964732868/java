package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class PrivateDemo {//保护内部

	public static void main(String[] args) {
		Person person = new Person();//先不实现封装
//		person.age = -21;  //-21是不好的
//		person.name = "小明";
//		person.tell();
		person.setAge(-20); //通过方法的到的
		person.setName("小明");
		person.tell();
		
		Person1 person1 = new Person1();//构造方法自动执行  无参
		Person1 person3 = new Person1(30); //一个参数
		Person1 person2 = new Person1(30,"zhangsan");//两个参数
//		person2.tell();
	}

}

class Person{
//	public int age;
//	public String name;
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age <150) {
		  this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void tell() {
		System.out.println("姓名 ："+name +"  "+"年龄："+age);
	}
	
}

class Person1{
	int age;
	String name;
	
//	构造方法的重载
	public Person1() {
		System.out.println("HELLO");
	}
	public Person1(int age) {
		this.age = age;
		System.out.println("年龄："+age);
	}
	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("姓名 ："+name +"  "+"年龄："+age);
	}
	
}
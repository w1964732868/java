package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class YinYongDemo {

	public static void main(String[] args) {
		People people = new  People("信息",20);
		people.tell();
		System.out.println();
		System.out.println("person2类");
		Person2 person2 =new Person2();
		System.out.println(person2);
		person2.tell();
	}
}

class People{
	private int age;
	private String name;
	
//	构造方法重载
	public People() {
		System.out.println("无参构造方法");
	}
	public People(String name,int age) {
		this();//调用无参构造方法
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void tell() {
		System.out.println("姓名："+this.getName() +"    "+"年龄: " +this.getAge()+"      信息11111111111"); //this可以去掉
		System.out.println("姓名："+name +"    "+"年龄: " +age+"      信息22222222222"); //this可以去掉
	}
}

class Person2{
	public void tell() {
		System.out.println(this);//---------------------
	}
}
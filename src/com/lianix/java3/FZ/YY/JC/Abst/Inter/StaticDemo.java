package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class StaticDemo {

	public static void main(String[] args) {
		Person11 p =new Person11("张三");
		p.tell();
		Person11 p1 =new Person11("张");
		
//		Person11.addres = "上海";//static属性   类名.变量名
		Person11.setAddres("上海");//private
		
		p1.tell();
		Person11 p2 =new Person11("三");
//		p2.addres = "上海";
		p2.tell();
		Person11 p3 =new Person11("张三11");
		p3.tell();
	}
}

class Person11{
	String name;
	private  static String addres = "北京";
	
	public static String getAddres() {
		return addres;
	}
	public static void setAddres(String addres) {
		Person11.addres = addres;
	}
	public Person11(String name) {
		this.name = name;
	}
	public Person11(String name,String  addres) {
		this.addres = addres;
		this.name = name;
	}
	
	public void tell() {
		System.out.println("姓名: "+name+"   "+"地址: " + addres);
	}
}
package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class StaticDemo {

	public static void main(String[] args) {
		Person11 p =new Person11("����");
		p.tell();
		Person11 p1 =new Person11("��");
		
//		Person11.addres = "�Ϻ�";//static����   ����.������
		Person11.setAddres("�Ϻ�");//private
		
		p1.tell();
		Person11 p2 =new Person11("��");
//		p2.addres = "�Ϻ�";
		p2.tell();
		Person11 p3 =new Person11("����11");
		p3.tell();
	}
}

class Person11{
	String name;
	private  static String addres = "����";
	
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
		System.out.println("����: "+name+"   "+"��ַ: " + addres);
	}
}
package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class YinYongDemo {

	public static void main(String[] args) {
		People people = new  People("��Ϣ",20);
		people.tell();
		System.out.println();
		System.out.println("person2��");
		Person2 person2 =new Person2();
		System.out.println(person2);
		person2.tell();
	}
}

class People{
	private int age;
	private String name;
	
//	���췽������
	public People() {
		System.out.println("�޲ι��췽��");
	}
	public People(String name,int age) {
		this();//�����޲ι��췽��
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
		System.out.println("������"+this.getName() +"    "+"����: " +this.getAge()+"      ��Ϣ11111111111"); //this����ȥ��
		System.out.println("������"+name +"    "+"����: " +age+"      ��Ϣ22222222222"); //this����ȥ��
	}
}

class Person2{
	public void tell() {
		System.out.println(this);//---------------------
	}
}
package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class PrivateDemo {//�����ڲ�

	public static void main(String[] args) {
		Person person = new Person();//�Ȳ�ʵ�ַ�װ
//		person.age = -21;  //-21�ǲ��õ�
//		person.name = "С��";
//		person.tell();
		person.setAge(-20); //ͨ�������ĵ���
		person.setName("С��");
		person.tell();
		
		Person1 person1 = new Person1();//���췽���Զ�ִ��  �޲�
		Person1 person3 = new Person1(30); //һ������
		Person1 person2 = new Person1(30,"zhangsan");//��������
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
		System.out.println("���� ��"+name +"  "+"���䣺"+age);
	}
	
}

class Person1{
	int age;
	String name;
	
//	���췽��������
	public Person1() {
		System.out.println("HELLO");
	}
	public Person1(int age) {
		this.age = age;
		System.out.println("���䣺"+age);
	}
	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("���� ��"+name +"  "+"���䣺"+age);
	}
	
}
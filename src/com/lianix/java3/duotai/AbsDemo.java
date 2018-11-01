package com.lianix.java3.duotai;

public class AbsDemo {

	public static void main(String[] args) {
		Student student = new Student(10, "С��", 60);
		student.want();
		Worker worker = new Worker(20, "С��", 2000);
		worker.want();
	}

}

abstract class Person{
//	����
	private int age;
	private String name;
//	���췽��
	public Person(int age,String name) {
		this.name = name;
		this.age = age;
	}
//	set get
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
//	����
	public abstract void want();
}

class Student extends Person{
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int age,String name,int score) {
		super(age, name);//��д ����
		this.score = score;
	}
	public void want() {//��д ����
		System.out.println("����"+getName()+"   "+"����"+getAge()+"   "+"����"+getScore());
	}
}
//  �̳�
class Worker extends Person{
//	����
	private int money;
//	set get 
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
// ���췽��
	public Worker(int age,String name,int money) {
//		��д����
		super(age, name);//��д ����
		this.money = money;
	}
//	��д
	public void want() {//��д ����
		System.out.println("����"+getName()+"   "+"����"+getAge()+"   "+"����"+getMoney());
	}
}
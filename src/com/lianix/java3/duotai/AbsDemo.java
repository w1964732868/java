package com.lianix.java3.duotai;

public class AbsDemo {

	public static void main(String[] args) {
		Student student = new Student(10, "小红", 60);
		student.want();
		Worker worker = new Worker(20, "小明", 2000);
		worker.want();
	}

}

abstract class Person{
//	变量
	private int age;
	private String name;
//	构造方法
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
//	方法
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
		super(age, name);//复写 父类
		this.score = score;
	}
	public void want() {//重写 父类
		System.out.println("姓名"+getName()+"   "+"年龄"+getAge()+"   "+"分数"+getScore());
	}
}
//  继承
class Worker extends Person{
//	变量
	private int money;
//	set get 
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
// 构造方法
	public Worker(int age,String name,int money) {
//		重写父类
		super(age, name);//复写 父类
		this.money = money;
	}
//	重写
	public void want() {//重写 父类
		System.out.println("姓名"+getName()+"   "+"年龄"+getAge()+"   "+"工资"+getMoney());
	}
}
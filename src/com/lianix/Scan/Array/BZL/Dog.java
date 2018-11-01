package com.lianix.Scan.Array.BZL;

public class Dog {
	int age;


	public Dog(String name) {
		System.out.println("小狗的名字是：" + name);
	}

	public int getAge() {
		System.out.println("小狗的年龄：" + age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Dog caiNiaoLei = new Dog("tony");
		caiNiaoLei.setAge(1);
	
		caiNiaoLei.getAge();
		System.out.println("变量值：" + caiNiaoLei.age);
	}

}

package com.lianix.Scan.Array.BZL;

public class Dog {
	int age;


	public Dog(String name) {
		System.out.println("С���������ǣ�" + name);
	}

	public int getAge() {
		System.out.println("С�������䣺" + age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Dog caiNiaoLei = new Dog("tony");
		caiNiaoLei.setAge(1);
	
		caiNiaoLei.getAge();
		System.out.println("����ֵ��" + caiNiaoLei.age);
	}

}

package com.lianix.java3.duotai;

public class DuoTaiDemo {
	public static void main(String[] args) {
		//(����ת��)
//		B b = new B();
//		A a = b;//(����ת��)
//		a.tell1();
//		a.tell2();//���ñ���д���

		
		//����ת��    
//		��-����
		A a = new B();//��
		B b = (B)a;//��
		b.tell1();
		b.tell2();
		b.tell3();
		
		System.out.println();
//		2
//		say(new B());
//		say1(new C());
		
//		B���õ�����д��A��tell1����  A C������A��tell1����
		System.out.println();
		say(new A());
		say(new B());
		say(new C());
	}
//	2
//	private static void say(B b) {
//		b.tell1();
//	}
//    private static void say1(C c) {
//	 	c.tell1();
//	}
	
	
	  private static void say(A a) {
		 	a.tell1();
		}
}

class A{
	public void tell1() {
		System.out.println("A��tell1����");
	}
	public void tell2() {
		System.out.println("A��tell2����");
	}
}

class B extends A{
	public void tell1() {//��д
		System.out.println("B��tell1����");
	}
	public void tell3() {
		System.out.println("B��tell3����");
	}
}

class C extends A{
	private void tell4() {
		System.out.println("C��tell4����");
	}
}
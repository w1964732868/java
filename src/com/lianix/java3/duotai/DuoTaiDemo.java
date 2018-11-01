package com.lianix.java3.duotai;

public class DuoTaiDemo {
	public static void main(String[] args) {
		//(向上转型)
//		B b = new B();
//		A a = b;//(向上转型)
//		a.tell1();
//		a.tell2();//调用被重写后的

		
		//向下转型    
//		上-》下
		A a = new B();//上
		B b = (B)a;//下
		b.tell1();
		b.tell2();
		b.tell3();
		
		System.out.println();
//		2
//		say(new B());
//		say1(new C());
		
//		B调用的是重写的A的tell1方法  A C都调用A的tell1方法
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
		System.out.println("A类tell1方法");
	}
	public void tell2() {
		System.out.println("A类tell2方法");
	}
}

class B extends A{
	public void tell1() {//重写
		System.out.println("B类tell1方法");
	}
	public void tell3() {
		System.out.println("B类tell3方法");
	}
}

class C extends A{
	private void tell4() {
		System.out.println("C类tell4方法");
	}
}
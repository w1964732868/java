package com.lianix.java3.duotai;

public class DuoTaiDemoInstanceOf {

	public static void main(String[] args) {
		A1 a1 = new A1();
		System.out.println(a1 instanceof A1);//true
		System.out.println(a1 instanceof B1);//false
		
		A1 a11 = new B1();//上
		System.out.println(a11 instanceof A1);//true
		System.out.println(a11 instanceof B1);//true
	}

}

class A1{
	public void tell1() {
		System.out.println("A1类tell1方法");
	}
	public void tell2() {
		System.out.println("A1类tell2方法");
	}
}

class B1 extends A1{
	public void tell1() {//重写
		System.out.println("B1类tell1方法");
	}
	public void tell3() {
		System.out.println("B1类tell3方法");
	}
}
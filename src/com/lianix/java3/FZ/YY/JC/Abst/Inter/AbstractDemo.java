package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//抽象类不能直接实例化
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A1 a1= new A1();//抽象类不能直接实例化
		AB ab = new AB();//通过子类调用父类的抽象方法
		ab.setAge(20);
		ab.say();
		ab.say1();
	}
}

abstract class A1{//抽象类
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	非抽象方法
	public void tell() {
		
	}
//	抽象方法 未被实现的方法
	public abstract void say(); //抽象方法
	public abstract void say1();
}


class AB extends A1{
	public void say() {
		System.out.println("1");
		System.out.println("年龄是:"+getAge());
	}
   public void say1() {
		System.out.println("2");
	}
}

package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//接口  全部都是全局常量 公共抽象方法   //全局static常量final    公共 public 的不能改变的
//接口可以多实现    通过子类实现的
//类是单继承
interface inter{
	public static final int AGE =10;
	public abstract void name();
}
interface inter1{
	public static final int NAE =11;
	public abstract void name1();
}

interface inter3 extends inter,inter1{//接口可以多实现
	
}
abstract class A33{//抽象类
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void tell() {
		
	}
//	抽象方法 未被实现的方法
	public abstract void say(); //抽象方法
	public abstract void say1();
}

class A2 extends A33 implements inter,inter1{
	public  void name() {//重写抽象方法
		System.out.println("inter");
	};
   public  void name1() {//重写抽象方法
	   System.out.println("inter1");
	};
	public void say() {
		System.out.println("1");
	}
   public void say1() {
		System.out.println("2");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.name();
		a2.name1();
		System.out.println(inter.AGE);
		a2.say();
		a2.say1();
	}
}

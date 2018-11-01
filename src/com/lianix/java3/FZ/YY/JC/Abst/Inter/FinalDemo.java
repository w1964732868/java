package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class FinalDemo {

	public static void main(String[] args) {
//		final类不能继承  不能有子类
//		final方法不能重写
//		final的变量是常量 不能修改
		 final int AGE = 10; 
		 //int age = 10;  age = 100;
	}
}
class Person03{					//final class Person03不能有子类
	
	public  void name() { 		//加了final public final void name() 子类不能重写  
		
	}
}

class Student02 extends Person03{
    public void name() {		//重写了
		
	}
}
package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//�����಻��ֱ��ʵ����
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A1 a1= new A1();//�����಻��ֱ��ʵ����
		AB ab = new AB();//ͨ��������ø���ĳ��󷽷�
		ab.setAge(20);
		ab.say();
		ab.say1();
	}
}

abstract class A1{//������
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	�ǳ��󷽷�
	public void tell() {
		
	}
//	���󷽷� δ��ʵ�ֵķ���
	public abstract void say(); //���󷽷�
	public abstract void say1();
}


class AB extends A1{
	public void say() {
		System.out.println("1");
		System.out.println("������:"+getAge());
	}
   public void say1() {
		System.out.println("2");
	}
}

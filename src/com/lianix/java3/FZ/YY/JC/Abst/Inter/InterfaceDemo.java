package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//�ӿ�  ȫ������ȫ�ֳ��� �������󷽷�   //ȫ��static����final    ���� public �Ĳ��ܸı��
//�ӿڿ��Զ�ʵ��    ͨ������ʵ�ֵ�
//���ǵ��̳�
interface inter{
	public static final int AGE =10;
	public abstract void name();
}
interface inter1{
	public static final int NAE =11;
	public abstract void name1();
}

interface inter3 extends inter,inter1{//�ӿڿ��Զ�ʵ��
	
}
abstract class A33{//������
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void tell() {
		
	}
//	���󷽷� δ��ʵ�ֵķ���
	public abstract void say(); //���󷽷�
	public abstract void say1();
}

class A2 extends A33 implements inter,inter1{
	public  void name() {//��д���󷽷�
		System.out.println("inter");
	};
   public  void name1() {//��д���󷽷�
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

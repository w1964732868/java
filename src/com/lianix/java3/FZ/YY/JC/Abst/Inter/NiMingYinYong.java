package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class NiMingYinYong {

	public static void main(String[] args) {
		System.out.println("====������ ֻ��һ��====");
		new Student().tell();//������ ֻ��һ��  Hello
		System.out.println();

		//		���ô���
		System.out.println("���ô���");
		System.out.println("====�޸�Student�������temp��ֵ=====");
		Student student1 = new Student();
		System.out.println("��ʼ: "+student1.temp);
		student1.temp = 20;
		System.out.println("�޸�һ: "+student1.temp);
		tell(student1);
		System.out.println("�޸Ķ�: "+student1.temp);
		System.out.println();
		
		System.out.println("====�޸�main�������str=======");
		String str = "Hello1";//String ���ɱ� //�޸�main�������str
		System.out.println(str);
		telll(str);
		System.out.println(str);
		System.out.println();
		
		System.out.println("======�޸�Student�������a======");
		student1.a = "Hello22222222222222222";//�޸�Student�����a
		System.out.println(student1.a);//���¿����˿ռ�
		tell2(student1);
		System.out.println(student1.a);//�ٴθ���
	}
	public static void tell(Student student2) {//��̬���� ���ܵ��÷Ǿ�̬�����Ժͷ���
		student2.temp = 30;
	}
	public static void telll(String str1) {
		str1 = "jike1";
	}
	public static void tell2(Student b) {
		b.a = "jike2";
	}
}
class Student{
	public  void tell() {
		System.out.println("������ Hello");
	}
	int temp = 10;

	String a = "Hello2";
}
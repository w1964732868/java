package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//  java ���̳�
public class JiCheng {

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.setAge(13);
		student.setName("zs");
		student.setScore(60);
		student.tell();//����
		student.say();
	}
}

class Person012{//����
	private int age;
	private String name;
	
	public Person012(){
		System.out.println("���๹��");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void tell() {
		System.out.println("����: "+getName()+"   "+"����: " + getAge()+"   "+"����");
	}
}



//  ����private ������   �������ͨ��get set ��������
class 	Student1  extends Person012{
//	private int age;
//	private String name;
	private int score;//ѧ�����е�
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public Student1(){
//		super();ʡ����super()
		System.out.println("���๹��");
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	


	public void tell() {//��д�����   ������public Ҳ���Ը�����һ����д
		super.tell();//���ø������
		System.out.println("����: "+getName()+"   "+"����: "+getAge()+"   "+"����");
	}
	
	
	public void say() {//��������
		System.out.println("�ɼ�: "+getScore()+"     "+"����: "+getName()+"   "+"����: " + getAge());
	}
}
	class Work extends Person012{//�ǿ��Ե�
		
		
	}


// class Work extends Student1,Person012{//���̳� ���Ƕ�̳�
	
// }

//  ��д ���ุ��
//  ���� ͬһ��������
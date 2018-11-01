package com.lianix.java3.FZ.YY.JC.Abst.Inter;
//  java 单继承
public class JiCheng {

	public static void main(String[] args) {
		Student1 student = new Student1();
		student.setAge(13);
		student.setName("zs");
		student.setScore(60);
		student.tell();//父类
		student.say();
	}
}

class Person012{//父类
	private int age;
	private String name;
	
	public Person012(){
		System.out.println("父类构造");
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
		System.out.println("姓名: "+getName()+"   "+"年龄: " + getAge()+"   "+"父类");
	}
}



//  父类private 的属性   子类可以通过get set 方法调用
class 	Student1  extends Person012{
//	private int age;
//	private String name;
	private int score;//学生特有的
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
//		super();省略了super()
		System.out.println("子类构造");
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	


	public void tell() {//重写父类的   可以是public 也可以跟父类一样不写
		super.tell();//想让父类输出
		System.out.println("姓名: "+getName()+"   "+"年龄: "+getAge()+"   "+"子类");
	}
	
	
	public void say() {//子类特有
		System.out.println("成绩: "+getScore()+"     "+"姓名: "+getName()+"   "+"年龄: " + getAge());
	}
}
	class Work extends Person012{//是可以的
		
		
	}


// class Work extends Student1,Person012{//单继承 这是多继承
	
// }

//  重写 子类父类
//  重载 同一个类里面
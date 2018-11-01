package com.lianxi.java4.Thread4;

public class ThreadDemo01 {

	public static void main(String[] args) {
//		Thread
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
//		t1.run(); //��A ��B  �̲߳���ͨ��run���� ͨ��start
//		t2.run(); //��A ��B
//		AB����ִ��  ˭����˭ִ��
		t1.start();//A B A B�����ִ�� �߳� 
		t2.start();
		
//		Runable
		MyRunable r1 = new MyRunable("C");
		MyRunable r2 = new MyRunable("D");
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		t3.start();
		t4.start();
	}

}

class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name+":"+i);
		}
		super.run();
	}
}

class MyRunable implements Runnable{
	private String name;
	public MyRunable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int j = 0; j < 1000; j++) {
			System.out.println(name+":"+j);
		}
	}
} 
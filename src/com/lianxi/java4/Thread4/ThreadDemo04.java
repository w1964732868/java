package com.lianxi.java4.Thread4;

public class ThreadDemo04 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunableDemo01(),"A");
		Thread t2 = new Thread(new RunableDemo01(),"B");
		Thread t3 = new Thread(new RunableDemo01(),"C");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}

class RunableDemo01 implements Runnable{
//   ¸´Ð´run·½·¨
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
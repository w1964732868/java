package com.lianxi.java4.Thread4;

public class ThreadDemo05 {

	public static void main(String[] args) {
		RunableDemo02 r1 = new RunableDemo02();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
	}

}

class RunableDemo02 implements Runnable{
	private int ticket = 5;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) { //循环10次数
//			同步代码块   速度慢了 但没有负数了
//			synchronized (this) {//this就是车票  同步代码块
//				if (ticket > 0) {
//				try {
//					Thread.sleep(500);//有负数 资源无法共享
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("车票："+ ticket--);
//				}
//			}
			
			
			
//			调用同步方法
			tell();
		}
	}
//	同步方法
	public synchronized void tell() {
		if (ticket > 0) {
			try {
				Thread.sleep(500);//有负数 资源无法共享
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("车票："+ ticket--);
			}
	}
}
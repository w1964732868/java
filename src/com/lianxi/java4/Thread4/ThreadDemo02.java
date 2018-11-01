package com.lianxi.java4.Thread4;

public class ThreadDemo02 {

	public static void main(String[] args) {
		MyRunable1 runable1 = new MyRunable1("A");
//		MyRunable1 runable2 = new MyRunable1("B");
		Thread t1 = new Thread(runable1);
//		Thread t2 = new Thread(runable2);
//		isAlive线程的执行状态 未执行false   A自己就行
		System.out.println(t1.isAlive());
		t1.start();
		
		
//		for (int i = 0; i < 50; i++) {
//			if (i>10) {
//				try { 
//					t1.join();//t1强行执行  这个是自己的线程    
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("主线程"+i);
//		}
		
//		执行true
		System.out.println(t1.isAlive());
//		t2.start();
		}

}

class MyRunable1 implements Runnable{
	private String name;
	public MyRunable1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int j = 0; j < 50; j++) {
//			System.out.println("当前线程"+Thread.currentThread().getName());//.getName()得到当前执行线程的名称
//			try {
//				Thread.sleep(1000);//1秒执行一次
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			System.out.println(name+":"+j);
		}
	}
} 
package com.lianxi.java4.Thread4;


public class ThreadDemo03 {
//  œﬂ≥Ãµƒ¿Ò»√ yiled
	public static void main(String[] args) {
		MyRunable2 r1 = new MyRunable2("A");
		MyRunable2 r2 = new MyRunable2("B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		}

}

class MyRunable2 implements Runnable{
	private String name;
	public MyRunable2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int j = 0; j < 50; j++) {
			System.out.println(name+":"+j);
			if (j == 10) {
				System.out.println("¿Ò»√");
				Thread.yield();
			}
		}
	}
} 
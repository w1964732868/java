package com.lianxi.java4.Thread4;

public class ThreadDemo02 {

	public static void main(String[] args) {
		MyRunable1 runable1 = new MyRunable1("A");
//		MyRunable1 runable2 = new MyRunable1("B");
		Thread t1 = new Thread(runable1);
//		Thread t2 = new Thread(runable2);
//		isAlive�̵߳�ִ��״̬ δִ��false   A�Լ�����
		System.out.println(t1.isAlive());
		t1.start();
		
		
//		for (int i = 0; i < 50; i++) {
//			if (i>10) {
//				try { 
//					t1.join();//t1ǿ��ִ��  ������Լ����߳�    
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("���߳�"+i);
//		}
		
//		ִ��true
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
//			System.out.println("��ǰ�߳�"+Thread.currentThread().getName());//.getName()�õ���ǰִ���̵߳�����
//			try {
//				Thread.sleep(1000);//1��ִ��һ��
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			System.out.println(name+":"+j);
		}
	}
} 
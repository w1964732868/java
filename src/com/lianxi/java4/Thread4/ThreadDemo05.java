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
		for (int i = 0; i < 10; i++) { //ѭ��10����
//			ͬ�������   �ٶ����� ��û�и�����
//			synchronized (this) {//this���ǳ�Ʊ  ͬ�������
//				if (ticket > 0) {
//				try {
//					Thread.sleep(500);//�и��� ��Դ�޷�����
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("��Ʊ��"+ ticket--);
//				}
//			}
			
			
			
//			����ͬ������
			tell();
		}
	}
//	ͬ������
	public synchronized void tell() {
		if (ticket > 0) {
			try {
				Thread.sleep(500);//�и��� ��Դ�޷�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("��Ʊ��"+ ticket--);
			}
	}
}
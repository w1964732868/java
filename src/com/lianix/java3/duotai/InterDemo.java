package com.lianix.java3.duotai;

interface USB{
	void start();
	void stop();
}

class CC {
	public static void work(USB usb) {
		usb.start();
		System.out.println("������");
		usb.stop();
	}
}

class UsbDisk implements USB{
	public void start() {//��д
		System.out.println("U�̿�ʼ����");
	}
	public void stop() {
		System.out.println("U�̽�������");
	}
}
class Printer implements USB{

	public void start() {//��д
		System.out.println("��ӡ���̿�ʼ����");
	}
	public void stop() {
		System.out.println("��ӡ����������");
	}
	
}

public class InterDemo {

	public static void main(String[] args) {
		CC.work(new UsbDisk());//CC���work���� �Ǿ�̬��
		CC.work(new Printer());

	}

}

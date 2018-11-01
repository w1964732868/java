package com.lianix.java3.duotai;

interface USB{
	void start();
	void stop();
}

class CC {
	public static void work(USB usb) {
		usb.start();
		System.out.println("工作中");
		usb.stop();
	}
}

class UsbDisk implements USB{
	public void start() {//重写
		System.out.println("U盘开始工作");
	}
	public void stop() {
		System.out.println("U盘结束工作");
	}
}
class Printer implements USB{

	public void start() {//重写
		System.out.println("打印机盘开始工作");
	}
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}

public class InterDemo {

	public static void main(String[] args) {
		CC.work(new UsbDisk());//CC类的work方法 是静态的
		CC.work(new Printer());

	}

}

package com.lianxi.java4.IO3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	static File file = new File("hello12.txt");
	public static void main(String[] args) {
		if (file.exists()) {//保证每次写入文件 都是新的文件
			file.delete();
		}
//		写入完成开启
		new WriteFile(file, 1).start();
		new WriteFile(file, 2).start();
		new WriteFile(file, 3).start();
		new WriteFile(file, 4).start();
		new WriteFile(file, 5).start();

		
//		try {
//			RandomAccessFile raf = new RandomAccessFile(file, "r");
//			raf.seek(300);
//			byte b[] = new byte[20];
//			raf.read();
//			String in =new String(b);
//			System.out.println(in);
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}

//  线程
//class WriteFile1 extends Thread{
//	File file;
//	int flock;//写 负责的区块
//	public WriteFile1(File file, int b) {
//		this.file = file;
//		this.flock  = b;
//	}
//	public void run() {
//		RandomAccessFileDemo raf = new RandomAccessFileDemo(file,"rw");
//	}
//}

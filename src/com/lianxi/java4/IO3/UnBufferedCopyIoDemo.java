package com.lianxi.java4.IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnBufferedCopyIoDemo {

	public static void main(String[] args) {
//		文件读取  文件写入 文件coty
//		文件copy
		try {
//			现在不是txt   是音乐...
			FileInputStream fis = new FileInputStream("hello.txt");
		    FileOutputStream fos = new FileOutputStream("hello11.txt");
		    
			byte b[] = new byte[50];
			int count = 0;
			long before = System.currentTimeMillis();
//			循环写入
			while(fis.read(b) != -1) {
				fos.write(b);
				count ++;
			}
			fos.close();
			fis.close();
			System.out.println(System.currentTimeMillis() - before+"ms");
			System.out.println("读取"+count+"次");
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

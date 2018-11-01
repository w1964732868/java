package com.lianxi.java4.IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnBufferedCopyIoDemo {

	public static void main(String[] args) {
//		�ļ���ȡ  �ļ�д�� �ļ�coty
//		�ļ�copy
		try {
//			���ڲ���txt   ������...
			FileInputStream fis = new FileInputStream("hello.txt");
		    FileOutputStream fos = new FileOutputStream("hello11.txt");
		    
			byte b[] = new byte[50];
			int count = 0;
			long before = System.currentTimeMillis();
//			ѭ��д��
			while(fis.read(b) != -1) {
				fos.write(b);
				count ++;
			}
			fos.close();
			fis.close();
			System.out.println(System.currentTimeMillis() - before+"ms");
			System.out.println("��ȡ"+count+"��");
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

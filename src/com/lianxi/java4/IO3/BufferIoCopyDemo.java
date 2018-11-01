package com.lianxi.java4.IO3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIoCopyDemo {

	public static void main(String[] args) {
		try {
//          ����������� ���  �ֽ���   ���Ż�����
//			hello.txt   ����.mp4
			FileInputStream fis = new FileInputStream("hello.txt");
//			====��������޸Ĳ�����   ��ֵ
			BufferedInputStream bis = new BufferedInputStream(fis,1000);//����Buffered stream�Ļ�����  fis,100 100�ǻ�������С   2
			
			
//		    ����ļ���copy����
			FileOutputStream fos = new FileOutputStream("hello11.txt");
//			====
			BufferedOutputStream bos = new BufferedOutputStream(fos,1000);
			
//			50�����Ż�
//			====
			byte b[] = new byte[80];//50���  ��ȡ�Ĵ��������  1
			
			int count = 0;
			long before = System.currentTimeMillis();
//			System.out.println(System.currentTimeMillis());
			while (bis.read(b) != -1) {
				bos.write(b);
				count ++;
			}
			
			bis.close();
			fis.close();
			
			
			bos.close();
			fos.close();
			
//			System.out.println(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis() - before+"ms");
			System.out.println("��ȡ"+count+"��");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

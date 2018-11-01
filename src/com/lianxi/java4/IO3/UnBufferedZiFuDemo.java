package com.lianxi.java4.IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UnBufferedZiFuDemo {

	public static void main(String[] args) {
		try {
//			不带缓冲的字符流
			
//			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream("hello.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			FileOutputStream fos = new FileOutputStream("hello11.txt");
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			
			
			char input[] = new char[10];
			
			int l = 0;//
			
			while ((l = isr.read(input)) != -1) {//
//				System.out.println(input);//字符 转换成了字符串
//				System.out.println(new String(input,0,l));//字符 转换成了字符串   //   加,0,l不会出现多余的la
				osr.write(input,0,l);//0偏移量  l长度        加,0,l不会出现多余的la
			}
			
			
			isr.close();
			fis.close();
			
			osr.close();
			fos.close();
			
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

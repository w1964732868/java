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
//			����������ַ���
			
//			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream("hello.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			FileOutputStream fos = new FileOutputStream("hello11.txt");
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			
			
			char input[] = new char[10];
			
			int l = 0;//
			
			while ((l = isr.read(input)) != -1) {//
//				System.out.println(input);//�ַ� ת�������ַ���
//				System.out.println(new String(input,0,l));//�ַ� ת�������ַ���   //   ��,0,l������ֶ����la
				osr.write(input,0,l);//0ƫ����  l����        ��,0,l������ֶ����la
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

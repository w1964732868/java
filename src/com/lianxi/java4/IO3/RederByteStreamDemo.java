package com.lianxi.java4.IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RederByteStreamDemo {

	public static void main(String[] args) {
		try {
//			���ļ�  �ֽ���   ��ȡtxt��������� ��ʾ����
//			��
			FileInputStream fis = new FileInputStream("test.txt");
			byte input[] = new byte[20];
			fis.read(input);//��ȡ���ݷ������飨Input����             һ������ռ�����ֽ�
//			��ȡ������תΪ�ַ��� 
			String inputString = new String(input,"GBK");//Ĭ���ַ��� utf-8   ������ҵĲ�һ��
			System.out.println(inputString);
//			�ر�
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

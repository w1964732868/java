package com.lianxi.java4.file2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadFile {

	public static void main(String[] args) {
//		���ļ�����
		File file = new File("test.txt");//�����ļ�   test.txt���·��
		if(file.exists()) {
			System.out.println("exist");
			try {
//				�ļ�����3����
				FileInputStream fis = new FileInputStream(file);//���ļ�����     �ļ�������  ���ֽ�����      �����ļ�  �����ַ���ָ���ļ�·��     
				InputStreamReader isr = new InputStreamReader(fis, "GBK");//������ ��װ��InputStreamReader ���ַ�����    ����������   �ַ���
				BufferedReader bfr = new BufferedReader(isr);//���л�������Reader
				
				String line;//��ʱ��Ŷ�ȡ��������
				while ((line = bfr.readLine()) != null) {//��ȡһ������   ��Ϊ��  �����������
					System.out.println(line);
				}
//				������
				bfr.close();
				isr.close();
				fis.close();
			} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
//			д��
			try {
				File  file2 = new File("newtext1.txt");
				FileOutputStream fos = new FileOutputStream(file2);//���newtext1.txt�ļ�������   FileOutputStream���Զ���������ļ�
				OutputStreamWriter 	osw = new OutputStreamWriter(fos, "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				
				bfw.write("��1����\n");
				bfw.write("��2����\n");//\n����
				
				
//				�ر������
				bfw.close();
				osw.close();
				fos.close();
				System.out.println("д�����");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

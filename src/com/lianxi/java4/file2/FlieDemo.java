package com.lianxi.java4.file2;

import java.io.File;
import java.io.IOException;

public class FlieDemo {

	public static void main(String[] args) {
		File file = new File("hello.txt");//pathname  hello.txt������������?
		if (file.exists()) {
			//������ + �ƶ�  ���봦��ͬһ������  ��ͬ����Ҫ����
			File newN = new File("src/newHello.txt");
			file.renameTo(newN);
			
			//�жϵ�ǰ�ļ��Ƿ��Ǹ��ļ�  false//E:\eclipse-workspace\lianix\hello.txt   ���·��
//			file.isFile();
//			System.out.println(file.isFile());
//			file.isDirectory();//�жϵ�ǰ �Ƿ��Ǹ�·��
//			System.out.println(file.isDirectory());//false
			
			//ɾ��
//			file.delete();  
//			System.out.println("�ļ���ɾ��");
		}else {
			System.out.println("�ļ�������");
			try {
				file.createNewFile();   //������ ���
				System.out.println("�ļ�������");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("�ļ��޷�������");
			}
		}
	}

}

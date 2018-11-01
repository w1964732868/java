package com.lianxi.java4.file2;

import java.io.File;

public class ReaderDemo {

	public static void main(String[] args) {
		File file = new File("hello.txt");
//		�ж��ļ��Ƿ����
		System.out.println("�ж��ļ��Ƿ����"+file.exists());
//		��ȡ�ļ�����
		System.out.println("��ȡ�ļ�����"+file.getName());
//		��ȡ�ļ�·�� ���·��
		System.out.println("��ȡ�ļ�·��"+file.getPath());
//		��ȡ�ļ�����·��
		System.out.println("��ȡ�ļ�����·��"+file.getAbsolutePath());
//		��ȡ�ļ�����·��
		System.out.println("��ȡ�ļ�����·��"+file.getParent());
		System.out.println("��ȡ�ļ�����·��"+new File(file.getAbsolutePath()).getParent());
//		��ȡ�ļ���С
		System.out.println("��ȡ�ļ���С"+(float)file.length()/1000+"KB");//++++++++++
//		�ж��ļ��Ƿ�����
		System.out.println("�ж��ļ��Ƿ�����"+file.isHidden());
//		�ж��ļ��Ƿ�ɶ�
		System.out.println("�ж��ļ��Ƿ�ɶ�"+file.canRead());
//		�ж��ļ��Ƿ��д
		System.out.println("�ж��ļ��Ƿ��д"+file.canWrite());
//		�ж��ļ��Ƿ�Ϊ�ļ���
		System.out.println("�ж��ļ��Ƿ�Ϊ�ļ���"+file.isDirectory());
	}
}

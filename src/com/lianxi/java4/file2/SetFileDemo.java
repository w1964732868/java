package com.lianxi.java4.file2;

import java.io.File;

public class SetFileDemo {

	public static void main(String[] args) {
		File file = new File("test.txt");
//		���ļ�����Ϊ��д
//		System.out.println("���ļ�����Ϊ��д"+file.setWritable(true));
////		���ļ�����Ϊ�ɶ�
//		System.out.println("���ļ�����Ϊ�ɶ�"+file.setReadable(true));
//		���ļ�����Ϊֻ��
		System.out.println("���ļ�����Ϊֻ��"+file.setReadOnly());
	}

}

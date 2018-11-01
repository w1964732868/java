package com.lianxi.java4.file2;

import java.io.File;

public class SetFileDemo {

	public static void main(String[] args) {
		File file = new File("test.txt");
//		将文件设置为可写
//		System.out.println("将文件设置为可写"+file.setWritable(true));
////		将文件设置为可读
//		System.out.println("将文件设置为可读"+file.setReadable(true));
//		将文件设置为只读
		System.out.println("将文件设置为只读"+file.setReadOnly());
	}

}

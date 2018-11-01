package com.lianxi.java4.file2;

import java.io.File;
import java.io.IOException;

public class FlieDemo {

	public static void main(String[] args) {
		File file = new File("hello.txt");//pathname  hello.txt被创建在哪里?
		if (file.exists()) {
			//重命名 + 移动  必须处于同一个分区  不同分区要拷贝
			File newN = new File("src/newHello.txt");
			file.renameTo(newN);
			
			//判断当前文件是否是个文件  false//E:\eclipse-workspace\lianix\hello.txt   相对路径
//			file.isFile();
//			System.out.println(file.isFile());
//			file.isDirectory();//判断当前 是否是个路径
//			System.out.println(file.isDirectory());//false
			
			//删除
//			file.delete();  
//			System.out.println("文件被删除");
		}else {
			System.out.println("文件不存在");
			try {
				file.createNewFile();   //不存在 添加
				System.out.println("文件被创建");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("文件无法被创建");
			}
		}
	}

}

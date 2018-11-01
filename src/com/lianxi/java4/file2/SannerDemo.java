package com.lianxi.java4.file2;

import java.io.File;

public class SannerDemo {

	public static void main(String[] args) {
		printFile(new File("E:\\eclipse-workspace\\lianix"),1);//绝对路径
	}
	
	public static void printFile(File dir,int tab) {
		if(dir.isDirectory()) {
			File next[] = dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				for (int j = 0; j < tab; j++) {
					System.out.print("|--");
				}
				System.out.println(next[i].getName());
				if (next[i].isDirectory()) {
					printFile(next[i],tab+1);
				}
				
//				if (next[i].isFile()) {//文件
//					System.out.println(next[i].getName());
//				}else {
//					System.out.println(next[i].getName());
//					printFile(next[i]);
//				}
			}
		}
	}
}

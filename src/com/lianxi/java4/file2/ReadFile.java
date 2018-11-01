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
//		读文件内容
		File file = new File("test.txt");//定义文件   test.txt相对路径
		if(file.exists()) {
			System.out.println("exist");
			try {
//				文件输入3个流
				FileInputStream fis = new FileInputStream(file);//读文件内容     文件输入流  （字节流）      传入文件  传入字符串指定文件路径     
				InputStreamReader isr = new InputStreamReader(fis, "GBK");//输入流 包装成InputStreamReader （字符流）    传入输入流   字符集
				BufferedReader bfr = new BufferedReader(isr);//带有缓冲区的Reader
				
				String line;//临时存放读取到的数据
				while ((line = bfr.readLine()) != null) {//读取一行数据   不为空  输出这行数据
					System.out.println(line);
				}
//				输入流
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
			
//			写入
			try {
				File  file2 = new File("newtext1.txt");
				FileOutputStream fos = new FileOutputStream(file2);//如果newtext1.txt文件不存在   FileOutputStream会自动创建这个文件
				OutputStreamWriter 	osw = new OutputStreamWriter(fos, "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				
				bfw.write("长1歌行\n");
				bfw.write("长2歌行\n");//\n换行
				
				
//				关闭输出流
				bfw.close();
				osw.close();
				fos.close();
				System.out.println("写入完成");
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

package com.lianxi.java4.IO3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RederByteStreamDemo {

	public static void main(String[] args) {
		try {
//			读文件  字节流   读取txt里面的文字 显示出来
//			打开
			FileInputStream fis = new FileInputStream("test.txt");
			byte input[] = new byte[20];
			fis.read(input);//读取数据放入数组（Input）中             一个汉字占两个字节
//			读取的数据转为字符串 
			String inputString = new String(input,"GBK");//默认字符集 utf-8   好像跟我的不一样
			System.out.println(inputString);
//			关闭
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

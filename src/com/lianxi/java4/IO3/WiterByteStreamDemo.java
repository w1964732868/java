package com.lianxi.java4.IO3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WiterByteStreamDemo {

	public static void main(String[] args) {
		try {
//			写入  字节流

			
			FileOutputStream fos = new FileOutputStream("testw.txt");
			String outString = "Write23的吗";
			byte[] b = outString.getBytes("GBK");//utf-8   GBK
//			写入
			fos.write(b);
//			关闭
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

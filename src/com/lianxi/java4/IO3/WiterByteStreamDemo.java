package com.lianxi.java4.IO3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WiterByteStreamDemo {

	public static void main(String[] args) {
		try {
//			д��  �ֽ���

			
			FileOutputStream fos = new FileOutputStream("testw.txt");
			String outString = "Write23����";
			byte[] b = outString.getBytes("GBK");//utf-8   GBK
//			д��
			fos.write(b);
//			�ر�
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

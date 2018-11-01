package com.lianxi.java4.IO3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIoCopyDemo {

	public static void main(String[] args) {
		try {
//          带缓冲的输入 输出  字节流   且优化过的
//			hello.txt   换成.mp4
			FileInputStream fis = new FileInputStream("hello.txt");
//			====这个可以修改参数的   数值
			BufferedInputStream bis = new BufferedInputStream(fis,1000);//带有Buffered stream的缓冲区  fis,100 100是缓冲区大小   2
			
			
//		    完成文件的copy工作
			FileOutputStream fos = new FileOutputStream("hello11.txt");
//			====
			BufferedOutputStream bos = new BufferedOutputStream(fos,1000);
			
//			50不断优化
//			====
			byte b[] = new byte[80];//50变大  读取的次数会变少  1
			
			int count = 0;
			long before = System.currentTimeMillis();
//			System.out.println(System.currentTimeMillis());
			while (bis.read(b) != -1) {
				bos.write(b);
				count ++;
			}
			
			bis.close();
			fis.close();
			
			
			bos.close();
			fos.close();
			
//			System.out.println(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis() - before+"ms");
			System.out.println("读取"+count+"次");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

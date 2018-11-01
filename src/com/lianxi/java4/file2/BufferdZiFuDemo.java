package com.lianxi.java4.file2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class BufferdZiFuDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
			FileOutputStream fos = new FileOutputStream("hello11.txt");
			
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter 	osw = new OutputStreamWriter(fos);
		
			BufferedReader bfr = new BufferedReader(isr);
			//没有换行符
//			BufferedWriter bfw = new BufferedWriter(osw);//没有换行符  没有true   必须在关闭前手动 bfw.flush();
			PrintWriter pw = new PrintWriter(osw,true);//换行  true自动 pw.flush();
			
			String line;
			while ((line = bfr.readLine()) != null) {
//				System.out.println(line);
//				bfw.write(line);//没有换行符
				pw.println(line);//换行
			}
			System.out.println("done11");
			
			//不管缓冲区是否填满 缓冲区强制输出
//			pw.flush();
			
			
//			bfw.close();//没有换行符
			pw.close();//换行
			bfr.close();
			osw.close();
			isr.close();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

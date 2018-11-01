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
			//û�л��з�
//			BufferedWriter bfw = new BufferedWriter(osw);//û�л��з�  û��true   �����ڹر�ǰ�ֶ� bfw.flush();
			PrintWriter pw = new PrintWriter(osw,true);//����  true�Զ� pw.flush();
			
			String line;
			while ((line = bfr.readLine()) != null) {
//				System.out.println(line);
//				bfw.write(line);//û�л��з�
				pw.println(line);//����
			}
			System.out.println("done11");
			
			//���ܻ������Ƿ����� ������ǿ�����
//			pw.flush();
			
			
//			bfw.close();//û�л��з�
			pw.close();//����
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

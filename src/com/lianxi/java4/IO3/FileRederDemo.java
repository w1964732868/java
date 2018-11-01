package com.lianxi.java4.IO3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileRederDemo {

	public static void main(String[] args) {
		try {
//			以字符  
			FileReader fr  = new FileReader("hello.txt");
			BufferedReader bfr1 = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("hello11.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line;
			while ((line = bfr1.readLine()) != null) {
				bw.write(line+"\n");//没有换行符    加+"\n" 会换行
 			}
			System.out.println("done11");
			
			bw.flush();
			
			bw.close();
			fw.close();
			
			bfr1.close();
			fr.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


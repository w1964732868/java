package com.lianxi.java4.IO3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class WriteFile extends Thread{
//	1(100个值)     2		  3	         4          5(block长度100) 写入位置
//	|----------|----------|----------|----------|----------(file)
//	0*L			1*L
	File file;
	int block = 1;//写 负责的区块
	int L = 100;
	public WriteFile(File file, int b) {//构造方法
		this.file = file;
		this.block  = b;
	}
	@Override
	public void run() {
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");//======会自动创建文件
//			|----------|-----===--|----------|----------|----------
//							|===						
			
			raf.seek((block-1)*L);//block从0开始   指到自己所对应的区块
			raf.writeBytes("This is a block"+block);//===== 
			
			for (int i = 0; i < 20; i++) {
				raf.writeBytes("-");
			}
			raf.writeBytes("\n");//======

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

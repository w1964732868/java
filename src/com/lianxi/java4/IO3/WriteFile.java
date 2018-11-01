package com.lianxi.java4.IO3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class WriteFile extends Thread{
//	1(100��ֵ)     2		  3	         4          5(block����100) д��λ��
//	|----------|----------|----------|----------|----------(file)
//	0*L			1*L
	File file;
	int block = 1;//д ���������
	int L = 100;
	public WriteFile(File file, int b) {//���췽��
		this.file = file;
		this.block  = b;
	}
	@Override
	public void run() {
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");//======���Զ������ļ�
//			|----------|-----===--|----------|----------|----------
//							|===						
			
			raf.seek((block-1)*L);//block��0��ʼ   ָ���Լ�����Ӧ������
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

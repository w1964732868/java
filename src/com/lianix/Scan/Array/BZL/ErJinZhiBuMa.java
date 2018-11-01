package com.lianix.Scan.Array.BZL;

public class ErJinZhiBuMa {

	public static void main(String[] args) {
//二进制的最高位是符号位	0正数 1负数
//		1101  符号位不变   其他为取反+1   -3
//		0101（5） + 1101（-3）    0010（2）
//		负数= 模-正数   取反+1   4的二进制的模为16  7+(-7)=16 -------------------------
//		0011（+3）   1101（-3）

		byte b1 = 5;
		// 两种改法
		byte b2 = (byte) (b1 + 3); // b1+3默认是int型
		int b22 = b1 + 3; 
		
		
		byte b222 = 124 + 3;
	}

}

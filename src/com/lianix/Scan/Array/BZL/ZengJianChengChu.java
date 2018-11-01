package com.lianix.Scan.Array.BZL;

public class ZengJianChengChu {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("++i的值" + ++i); // 2
		System.out.println("++i后i的值" + i);// 2
		// 先加+1
		i = 1;
		System.out.println("i++的值" + i++);// 1
		System.out.println("i++后i的值" + i);// 2

		System.out.println();

		int j = 2;
		System.out.println("++i的值" + --j); // 1
		System.out.println("++i后i的值" + j);// 1

		j = 2;
		System.out.println("i++的值" + j--);// 2
		System.out.println("i++后i的值" + j);// 1

		String space = "";// 空字符串
		System.out.println("空字符串" + space);
		space = space + ""; // 空格
		System.out.println("空格" + space);

//		debug 解决逻辑问题的步骤

	}

}

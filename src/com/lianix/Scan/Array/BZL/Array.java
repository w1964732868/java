package com.lianix.Scan.Array.BZL;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	public static void main(String[] args) {
//		数组 下标是唯一标示 一、二维数组  多维数组用到的比较少这个地方不讲
		int a = 1;
		int b = 2;
		System.out.println("===============未交互前");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("===============交互后");
		System.out.println(a);
		System.out.println(b);
//		两种声明方式   数组名和变量名命名方式一样    只有分配完空间 （new）
		int a1[] = new int[3]; // 为数组开辟空间 或实例化
		int[] b1; // 默认为NULL 不可以使用它
		System.out.println("------------------动态初始化");
		for (int i = 0; i < a1.length; i++) {
			// 动态初始化后
			a1[i] = i * 2 + 1;
			System.out.println(a1[i]);
		}
		// 静态数组
		System.out.println("+++++++++++++++++++静态数组");
		int c1[] = { 10, 20, 30 };
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println("+++++++++++++++++++求静态数组的最大值和最小值");
		int d1[] = { 50, 80, 90, 56, 98 };
		int max = d1[0];
		int min = d1[0];
		for (int i = 0; i < d1.length; i++) {
			if (d1[i] > max) {
				max = d1[i];
			}
			if (d1[i] < min) {
				min = d1[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		System.out.println("------------------求静态数组的最大值和最小值 用冒泡排序");

		int e1[] = { 14, 25, 13, 100, 80 };// 双for循环
		for (int i = 0; i < e1.length - 1; i++) {// -1 5个数组比较4次 取第一个数
			for (int j = i + 1; j < e1.length; j++) {// i+1 取第二个数
				if (e1[i] < e1[j]) {// j到前面 大的在前面
					e1[i] = e1[i] + e1[j];
					e1[j] = e1[i] - e1[j];
					e1[i] = e1[i] - e1[j];
				}
			}
			// 方便观察
			System.out.print("第" + (i + 1) + "次 排序：");
			for (int j = 0; j < e1.length; j++) {
				System.out.print(e1[j] + "  ");
			}
			System.out.println();// 第1次 排序：10014132580 换行
		}
		for (int i = 0; i < e1.length; i++) {
			System.out.print(e1[i] + "  ");
		}

		System.out.println(" ");

//		二维数组 [行][列]
//		int score [][] = new  int[5][5];//每一列  的行
//		score[1][0] = 9;
//		score[0][4] = 10;
//		score[4][4] = 6;
//		score[3][3] = 8;
		System.out.println("===================二维数组");
		int score[][] = { { 1, 6 }, { 8, 7 }, { 10, 12 }, { 10 } };
		for (int i = 0; i < score.length; i++) {// i 行
			for (int j = 0; j < score[i].length; j++) {// j是列   
				System.out.print(score[i][j] + " ");// 按i 每行的输出
			}
			System.out.println();
		}
	}

}

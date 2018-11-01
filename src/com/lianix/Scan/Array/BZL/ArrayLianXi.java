package com.lianix.Scan.Array.BZL;

public class ArrayLianXi {

	public static void main(String[] args) {
//		冒泡排序
//		每次的i j 的值都从上一次的结果得到
		int a[] = {50,90,85,64,97,60};//6门科目
		
		
		
		for (int i = 0; i < a.length-1; i++) {//a.length-1 = 5   i(0 1 2 3 4 这是前5个数据) 第6项不用比较   比较5次
			for (int j = i+1; j < a.length; j++) {//从第二项到
				if (a[i]<a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
			System.out.print("第"+(i+1)+"次，排序：");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+"  ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("最终排序结果:");//再遍历输出
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
//			System.out.println(a.length);
		}
		
		
	}

}

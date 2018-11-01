package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class DiGui {

	public static void main(String[] args) {
		System.out.println(addNum(100)); 	 //static 方法只能调用static方法
	}
	public static int addNum(int num) {		 //加一个static  可以调用  
		if (num == 1) {						 //程序出口
			return 1;
		}else {
			return num + addNum(num-1);		 //从1+....+100
		}
	}
}


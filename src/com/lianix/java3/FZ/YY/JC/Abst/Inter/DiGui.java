package com.lianix.java3.FZ.YY.JC.Abst.Inter;

public class DiGui {

	public static void main(String[] args) {
		System.out.println(addNum(100)); 	 //static ����ֻ�ܵ���static����
	}
	public static int addNum(int num) {		 //��һ��static  ���Ե���  
		if (num == 1) {						 //�������
			return 1;
		}else {
			return num + addNum(num-1);		 //��1+....+100
		}
	}
}


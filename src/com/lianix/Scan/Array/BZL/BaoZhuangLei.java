package com.lianix.Scan.Array.BZL;

public class BaoZhuangLei {

	public static void main(String[] args) {
//		С��     short 
//		���     int
//		Double��double�İ�װ��    ��װ����ʵ�õķ��� ����         
//		����string->byte  10-16/2/8
//		����     integer.MIN_VALUES  
//			 integer.MAX_VALUES  
//		     integer.parseInt(String sInterger)   parse  ��������˼  �Ѷ�Ӧ���ַ���ת��������       �ַ��� -�� ����
//		     integer.toBinaryString(int value)  10 -�� 2����String����
//		     integer.toHexString(int value)  10 -�� 16����String����
		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("108") + 10);// �ַ���ת��ΪByte

		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("108") + 2);// �ַ���ת��Ϊ����

		System.out.println(Integer.toBinaryString(16)); // 10 -> 2
		System.out.println(Integer.toHexString(16));// 10 ->16
		System.out.println(Integer.toOctalString(16));// 10 ->8
	}

}

package com.lianix.Scan.Array.BZL;

public class ZengJianChengChu {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("++i��ֵ" + ++i); // 2
		System.out.println("++i��i��ֵ" + i);// 2
		// �ȼ�+1
		i = 1;
		System.out.println("i++��ֵ" + i++);// 1
		System.out.println("i++��i��ֵ" + i);// 2

		System.out.println();

		int j = 2;
		System.out.println("++i��ֵ" + --j); // 1
		System.out.println("++i��i��ֵ" + j);// 1

		j = 2;
		System.out.println("i++��ֵ" + j--);// 2
		System.out.println("i++��i��ֵ" + j);// 1

		String space = "";// ���ַ���
		System.out.println("���ַ���" + space);
		space = space + ""; // �ո�
		System.out.println("�ո�" + space);

//		debug ����߼�����Ĳ���

	}

}

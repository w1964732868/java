package com.lianix.Scan.Array.BZL;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	public static void main(String[] args) {
//		���� �±���Ψһ��ʾ һ����ά����  ��ά�����õ��ıȽ�������ط�����
		int a = 1;
		int b = 2;
		System.out.println("===============δ����ǰ");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("===============������");
		System.out.println(a);
		System.out.println(b);
//		����������ʽ   �������ͱ�����������ʽһ��    ֻ�з�����ռ� ��new��
		int a1[] = new int[3]; // Ϊ���鿪�ٿռ� ��ʵ����
		int[] b1; // Ĭ��ΪNULL ������ʹ����
		System.out.println("------------------��̬��ʼ��");
		for (int i = 0; i < a1.length; i++) {
			// ��̬��ʼ����
			a1[i] = i * 2 + 1;
			System.out.println(a1[i]);
		}
		// ��̬����
		System.out.println("+++++++++++++++++++��̬����");
		int c1[] = { 10, 20, 30 };
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println("+++++++++++++++++++��̬��������ֵ����Сֵ");
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

		System.out.println("------------------��̬��������ֵ����Сֵ ��ð������");

		int e1[] = { 14, 25, 13, 100, 80 };// ˫forѭ��
		for (int i = 0; i < e1.length - 1; i++) {// -1 5������Ƚ�4�� ȡ��һ����
			for (int j = i + 1; j < e1.length; j++) {// i+1 ȡ�ڶ�����
				if (e1[i] < e1[j]) {// j��ǰ�� �����ǰ��
					e1[i] = e1[i] + e1[j];
					e1[j] = e1[i] - e1[j];
					e1[i] = e1[i] - e1[j];
				}
			}
			// ����۲�
			System.out.print("��" + (i + 1) + "�� ����");
			for (int j = 0; j < e1.length; j++) {
				System.out.print(e1[j] + "  ");
			}
			System.out.println();// ��1�� ����10014132580 ����
		}
		for (int i = 0; i < e1.length; i++) {
			System.out.print(e1[i] + "  ");
		}

		System.out.println(" ");

//		��ά���� [��][��]
//		int score [][] = new  int[5][5];//ÿһ��  ����
//		score[1][0] = 9;
//		score[0][4] = 10;
//		score[4][4] = 6;
//		score[3][3] = 8;
		System.out.println("===================��ά����");
		int score[][] = { { 1, 6 }, { 8, 7 }, { 10, 12 }, { 10 } };
		for (int i = 0; i < score.length; i++) {// i ��
			for (int j = 0; j < score[i].length; j++) {// j����   
				System.out.print(score[i][j] + " ");// ��i ÿ�е����
			}
			System.out.println();
		}
	}

}

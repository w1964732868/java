package com.lianix.Scan.Array.BZL;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

//		next()���տ���̨������ַ���  �ո�/�س�Ϊ����           ���ܽ��ո���Ϊ�ַ�������
//		nextLine()���տ���̨������ַ��� �Իس�Ϊ����     ���Խ��ղ��ֿո�
//		nextInt()
//		nextDouble()
//		nextBoolean() С��  ��

//		charAt(�±�/����) ջ               (new��  ��ַ)
//		�ӿ���̨����
		Scanner scanner = new Scanner(System.in);// System.in ���տ���̨������
//		System.out.println("������ ");
//		String name = scanner.next();

//		System.out.println("�Ա�:");
//		char sex = scanner.next().charAt(0);//charҪcharAt()

//		System.out.println("���䣺");
//		int age = scanner.nextInt();

//		System.out.println("��ߣ�");
//		double ss = scanner.nextDouble();

//	    ���������̨������չʾ����
//		System.out.println("Hi����Һã� �ҽ�"+name +"������"+age+"�꣬�����"+ss+"����ʿ");
		
		
		System.out.println("���������");
		int score = scanner.nextInt();
//		boolean isPass = score > 60;
//		System.err.println("60����:"+score+isPass);
		if (score > 60) {
			System.out.println(score + "�֣�����");
		} else {
			System.out.println(score + "�֣�������");
		}

//		�߼���������ȼ����ǣ�!�� ��(&&) ��(||)
		System.out.println("����5����:");
		int score1 = scanner.nextInt();
		boolean isPass1 = score1 >= 0 && score1 <=5;
		System.out.println(score1+"��5���Ʒ���:"+isPass1);

//		System.out.println("����5����:");
//		int score2 = scanner.nextInt();
//		boolean isPass2 = score2 < 0 || score2 >5;
//		System.out.println(score2+"��5���Ʒ���:"+isPass2);

//		System.out.println("����5����:");
//		int score3 = scanner.nextInt();
//		boolean isPass3 = !(score3 < 0 || score3 >5);
//		System.out.println(score3+"��5���Ʒ���:"+isPass3);

	}

}

package com.lianix.Scan.Array.BZL;

public class JiBenLeiXing {
	public static void main(String[] args) {
//    	8��������������
		// byte 8
		System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);
		System.out.println("��װ�ࣺjava.lang.Byte");
		System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		// short 16
		System.out.println("�������ͣ�short ������λ����" + Short.SIZE);
		System.out.println("��װ�ࣺjava.lang.Short");
		System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int 32
		System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);
		System.out.println("��װ�ࣺjava.lang.Integer");
		System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long 64
		System.out.println("�������ͣ�long ������λ����" + Long.SIZE);
		System.out.println("��װ�ࣺjava.lang.Long");
		System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float 16
		System.out.println("�������ͣ�float ������λ����" + Float.SIZE);
		System.out.println("��װ�ࣺjava.lang.Float");
		System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double 64
		System.out.println("�������ͣ�double ������λ����" + Double.SIZE);
		System.out.println("��װ�ࣺjava.lang.Double");
		System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char 16
		System.out.println("�������ͣ�char ������λ����" + Character.SIZE);
		System.out.println("��װ�ࣺjava.lang.Character");
		// ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨
		System.out.println("��Сֵ��Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨
		System.out.println("���ֵ��Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

		System.out.println("2��3�η���" + Math.pow(2, 8));

		// ƽ���� round��С�������һλ�������� ��������λ
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = "
				+ Math.round(10 * (Math.sqrt(20) + Math.sqrt(10)) / (Math.sqrt(20) - Math.sqrt(10))) / 10.0);

		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20 + sqrt10) / (sqrt20 - sqrt10);
		result = Math.round(10 * result) / 10.0;
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = " + result);

		String name = "�ŷ�";
		char sex = '��';
		short age = 25;
		float height = 1.99f;
		String type = "���ŵ�";
		System.out.println("��Һ�, ����" + name + "������" + age + "������һ��" + type + "��ʿ");

		name = "����";
		sex = 'Ů';
		age = 33;
		System.out.println("��Һ�, ����" + name + "������" + age + "������һ��" + type + "Ůʿ");
//    ��ϰ    
		name = "С��3";
		System.out.println("�ֻ�Ʒ��:" + name);
		String xitong = "android";
		System.out.println("����ϵͳ:" + xitong);
		int cpu = 2;
		System.out.println("CPU��:" + cpu);
		float price = 1999.0f;
		System.out.println("�۸�:" + price);
//        ������
		double d = 2.6;
		double c = d - 2;
		System.out.println(c);// 0.6000000000000001 1��������

		for (int i = 0; i <= 127; i++) {
			System.out.println((char) i + ":" + i);
		}
//    �Ʊ��
// \n����
// \t�Ʊ��  ����8-10���ո�
// \\��ʾ
//        
		System.out.print('\u4e2d' + ":");// ��
		System.out.println(4 * Math.pow(16, 3) + 14 * Math.pow(16, 2) + 2 * Math.pow(16, 1) + 13); // e=16 d=13
		System.out.println((char) 20013 + ":" + 20013);
		System.out.println("�Һ���\n����һ��");
		System.out.println("\t����������ʾ");
		System.out.println("System.out.println(\"˫����Ҳ���\");");

//        ��������
		boolean isPass;
		isPass = true;
		System.out.println("����ͨ��:" + isPass);
		isPass = false;
		System.out.println("����û��ͨ��:" + isPass);
		isPass = 65 > 60;
		System.out.println("65�ֵļ���:" + isPass);
//        С�����������ת�� JVM����
//        javaĬ��+������int�͵�
		int i = -2;
		long l = i;
		System.out.println(i + ":" + Integer.toBinaryString(i));// 11111111111111111111111111111110
		System.out.println(l + ":" + Long.toBinaryString(l));// 1111111111111111111111111111111111111111111111111111111111111110
																// ǰ32��1 ��32������һ��
//		int(��32λ  ����31λ���λ����λ)  -> float(32λ     β��/ ������23λ)    ����������ݶ�ʧ  ����ֶ�ʧ����
		int a = 0x1000001; // 28λ
		float f = a;
		System.out.println(Integer.toBinaryString(a) + ":" + a);// 1000000000000000000000001:16777217 16777217
		System.out.println(Integer.toBinaryString((int) f) + ":" + f);// 1000000000000000000000000:1.6777216E7
																		// 1.6777216*10^7 int��f��fת��Ϊint
//        long(64λ  36λβ��   63λ����) ->  double(64λ  52λβ��/����)
		long b = 0x20000000000001l; // 54λ
		double b1 = b;
		System.out.println(Long.toBinaryString(b) + ":" + b);
		System.out.println(Long.toBinaryString((long) b1) + ":" + b1);
//       ������ �� С����ת��  ǿת   Դ���ݵ�����λ  ��Ϊ    Ŀ�����ݵķ���λ
		int i1 = 129;
		System.out.println(i1 + ":" + Integer.toBinaryString(i1)); // 10000001 -127
		byte bb = (byte) i1;
//        		-2^7��-128��    -  2^7-1 ��127��
		System.out.println("2��7�η���" + Math.pow(2, 7));

		int i2 = 257;
		System.out.println(i2 + ":" + Integer.toBinaryString(i2)); // 1(��ʧ)00000001 +1
		byte bb1 = (byte) i2;
//      int (32λ) תΪchar(16λ)
		char c1 = 66;// 65����Ӧ���ַ�
		int i3 = 'B';// �ַ�B����Ӧ��ASII��
		System.out.println(c1 + ":" + i3);

		char c2 = 'C';
		int i4 = c2 + 1;
		c2 = (char) (c2 + 1);
		System.out.println(c2 + ":" + i4);
	}
}

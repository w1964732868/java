package com.lianix.Scan.Array.BZL;

public class ZiFuChuan {

	public static void main(String[] args) {
//		�ַ�������
		String str = " AaBb@";// ctrl+shift+F
//		System.out.println(str.length());
		// �ַ��� ת ����
//		char date[] = str.toCharArray();
//		for (int i = 0; i < date.length; i++) {
//			System.out.print(date[i]+" ");
//		}
//		���ַ�������ȡ�ַ� ��0��ʼ
//		System.out.println(str.charAt(3));
//		�ַ�����byte����֮���ת��
//		byte bytes[] = str.getBytes();
//		for (int i = 0; i < bytes.length; i++) {
////			System.out.print(bytes[i] + "  ");
////			System.out.println();
//			System.out.println(new String(bytes) + "\t");
//		}
//		�����ַ����Ĵ��ڵ��ַ�indexOf()
//		System.out.println(str.indexOf("@"));

//		�ַ���ȥ��ǰ��ո�
//		System.out.println(str.trim());
//		���ַ�����ȡ�����ַ���sunString()
//		��Сдת��toLowerCase() toUpperCase()
//		�ж��ַ����Ŀ�ͷ��β�ַ�endWith() startWith()
//		�滻String�ַ����е�һ���ַ���replace()
		
//		StringBulider��StringBuffer�ıȽ�
//		StringBulider ���߳��Ǹ��� append()׷��    insert()����
//		StringBuffer ��ȫ
//		String�����Ը��ĵ� �����µĸ��������� �����µĿռ�
		String sBuffer1 = "Hello";
		System.out.println("+++++++++++++String�����Ը��ĵ�");
		System.out.println(sBuffer1.toString());
		tell(sBuffer1);
		System.out.println(sBuffer1.toString());
//		StringBuffer���Ը��ĵ�
		System.out.println("+++++++++++++StringBuffer���Ը��ĵ�");
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("jike11");
		sBuffer.insert(0, "Love");// ��һ������ �����￪ʼ �ڶ�����ʲô���� ��0��ʼ
		sBuffer.replace(0, 3, "I love ");// start, end, str ��0��ʼ
		System.out.println(sBuffer.toString());
		tell(sBuffer);
		System.out.println(sBuffer.toString());
	}

//	StringBuffer���Ը��ĵ�   ���÷���  append()׷��    insert()����  replace() indexOf()
	public static void tell(StringBuffer s) {
		s.append("��");
//		System.out.println(s.toString());

	}

//	String�����Ը��ĵ� �����µĸ��������� �����µĿռ�
	public static void tell(String s) {
		s = "��";
	}
}

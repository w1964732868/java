package com.lianix.Scan.Array.BZL;

public class ArrayLianXi {

	public static void main(String[] args) {
//		ð������
//		ÿ�ε�i j ��ֵ������һ�εĽ���õ�
		int a[] = {50,90,85,64,97,60};//6�ſ�Ŀ
		
		
		
		for (int i = 0; i < a.length-1; i++) {//a.length-1 = 5   i(0 1 2 3 4 ����ǰ5������) ��6��ñȽ�   �Ƚ�5��
			for (int j = i+1; j < a.length; j++) {//�ӵڶ��
				if (a[i]<a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
			System.out.print("��"+(i+1)+"�Σ�����");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+"  ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("����������:");//�ٱ������
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
//			System.out.println(a.length);
		}
		
		
	}

}

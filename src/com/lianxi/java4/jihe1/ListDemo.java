package com.lianxi.java4.jihe1;

import java.util.List;
import java.util.Vector;

/*
 *
 * vector	     ͬ��  ��ȫ    ���ܵ�    �ٶ���  �ȳ���   ���ظ�
 * ArrayList   �첽 ����ȫ  ���ܸ�   �ٶȿ�  �����    ���ظ�
  
  */
//List�ǽӿ�

//isEmpty()
//int indexOf(Object o)

public class ListDemo {
	public static void main(String[] args) {
//		List<String> lists = null;//�첽 ���ܸ� ����ȫ ��   �ٶȿ�
//		lists = new ArrayList<String>();
//		lists.add("a");//���ݳɹ���ӵ�List����
//		lists.add("b");
//		lists.add("a");
//		for (int i = 0; i < lists.size(); i++) {//lists.size()��С  ��ӡ���� ��ӵ�����  �����ظ� 
//			System.out.println(lists.get(i));//��ʾ
//		}
//		lists.remove(0);
//		System.out.println("ɾ���Ժ�");
//		for (int i = 0; i < lists.size(); i++) {
//			System.out.println(lists.get(i));
//		}//b(0)  a(1)
//		System.out.println("�Ƿ�Ϊ��"+lists.isEmpty());//false
		
//		System.out.println("��ѯb�Ƿ����"+lists.indexOf("b"));//����
//		System.out.println("��ѯb�Ƿ����"+lists.indexOf("b"));
//		System.out.println("��ѯa�Ƿ����"+lists.indexOf("c"));//������ 
		
		List<String> lists1 = null;
		lists1 = new Vector<String>();//ͬ�� ���ܵ� ��ȫ ��
		lists1.add("a");
		lists1.add("b");
		lists1.add("b");
		
		System.out.println(lists1);
		
		for (int i = 0; i < lists1.size(); i++) {//lists.size()  ��ӡ���� ��ӵ�����  �����ظ� 
			System.out.println(lists1.get(i));
		}
		
	}
}


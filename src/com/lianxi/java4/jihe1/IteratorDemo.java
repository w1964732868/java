package com.lianxi.java4.jihe1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//���ϵĵ������
public class IteratorDemo {

	public static void main(String[] args) {
		List<String> lists =  new ArrayList<String>();
		lists.add("a");//���ݳɹ���ӵ�List����
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");
		Iterator<String> iterable = lists.iterator();
		while (iterable.hasNext()) {
//			String str = iterable.next();
//			if ("a".equals(str)) {
//				iterable.remove();
//			}else {
//				System.out.println(str);
//			}
//			

			String str1 = iterable.next();
//			lists.remove(1);//��������Ū ����ͨ�����϶���ɾ������
			System.out.println(str1);
			
		}
	}
}

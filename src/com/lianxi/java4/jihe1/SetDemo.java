package com.lianxi.java4.jihe1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//���������ظ� ����

//HashSet  ���� û���ظ�
//TreeSet  ���� û���ظ�
public class SetDemo {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("a");
		s.add("d");
		s.add("e");
		s.add("f");
		
		System.out.println(s);

		
		Set<String> s1= null;
		s1 = new TreeSet<String>();
		s1.add("a");
		s1.add("b");
		s1.add("a");
		s1.add("d");
		s1.add("e");
		s1.add("f");
		System.out.println(s1);

	}

}

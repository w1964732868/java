package com.lianxi.java4.jihe1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//集合的迭代输出
public class IteratorDemo {

	public static void main(String[] args) {
		List<String> lists =  new ArrayList<String>();
		lists.add("a");//数据成功添加到List里面
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
//			lists.remove(1);//不能这样弄 不能通过集合对象删除数据
			System.out.println(str1);
			
		}
	}
}

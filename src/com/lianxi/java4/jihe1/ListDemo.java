package com.lianxi.java4.jihe1;

import java.util.List;
import java.util.Vector;

/*
 *
 * vector	     同步  安全    性能低    速度慢  先出现   有重复
 * ArrayList   异步 不安全  性能高   速度快  后出现    有重复
  
  */
//List是接口

//isEmpty()
//int indexOf(Object o)

public class ListDemo {
	public static void main(String[] args) {
//		List<String> lists = null;//异步 性能高 不安全 后   速度快
//		lists = new ArrayList<String>();
//		lists.add("a");//数据成功添加到List里面
//		lists.add("b");
//		lists.add("a");
//		for (int i = 0; i < lists.size(); i++) {//lists.size()大小  打印出来 添加的数据  可以重复 
//			System.out.println(lists.get(i));//显示
//		}
//		lists.remove(0);
//		System.out.println("删除以后");
//		for (int i = 0; i < lists.size(); i++) {
//			System.out.println(lists.get(i));
//		}//b(0)  a(1)
//		System.out.println("是否为空"+lists.isEmpty());//false
		
//		System.out.println("查询b是否存在"+lists.indexOf("b"));//索引
//		System.out.println("查询b是否存在"+lists.indexOf("b"));
//		System.out.println("查询a是否存在"+lists.indexOf("c"));//不存在 
		
		List<String> lists1 = null;
		lists1 = new Vector<String>();//同步 性能低 安全 先
		lists1.add("a");
		lists1.add("b");
		lists1.add("b");
		
		System.out.println(lists1);
		
		for (int i = 0; i < lists1.size(); i++) {//lists.size()  打印出来 添加的数据  可以重复 
			System.out.println(lists1.get(i));
		}
		
	}
}


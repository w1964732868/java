package com.lianxi.java4.jihe1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



//HashMap
//HashTable

//list set add
//Map put
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();//一对数据
		map.put("key1", "jike1");
		map.put("key2", "jike2");
		map.put("key3", "jike3");
		map.put("key4", "jike4");
		map.put("key5", "jike5");
		map.put("key6", "jike6");
		map.put("key7", "jike7");
		map.put("key8", "jike8"); 
		
		//打印所有的键  通过set来承载它
	    Set<String> set1 = map.keySet();
	    Iterator<String> i = set1.iterator();
	    while (i.hasNext()) {
			System.out.println(i.next());
		}
	
	    System.out.println();
	    System.out.println();
	    System.out.println();
//	      打印所有的值
		Collection<String> c = map.values();//一个数据
		Iterator<String> i1 = c.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}

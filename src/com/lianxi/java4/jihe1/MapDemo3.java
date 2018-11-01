package com.lianxi.java4.jihe1;

import java.util.HashMap;
import java.util.Map;

//HashMap
//HashTable

//list set add
//Map put
public class MapDemo3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "jike1");
		map.put("key2", "jike2");
		map.put("key3", "jike3");
		map.put("key4", "jike4");
		map.put("key5", "jike5");
		map.put("key6", "jike6");
		map.put("key7", "jike7");
		map.put("key8", "jike8");
		if (map.containsKey("key11")) {//看key是否存在
			System.out.println("key存在");
		}else {
			System.out.println("key不存在");
		}
		
		
		if (map.containsValue("jike1")) {//看value是否存在 contains
			System.out.println("value存在");
		}else {
			System.out.println("value不存在");
		}
	}

}

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
		if (map.containsKey("key11")) {//��key�Ƿ����
			System.out.println("key����");
		}else {
			System.out.println("key������");
		}
		
		
		if (map.containsValue("jike1")) {//��value�Ƿ���� contains
			System.out.println("value����");
		}else {
			System.out.println("value������");
		}
	}

}

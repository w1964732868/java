package com.lianix.java3.fanxing;

public class TongPeiFu {

	public static void main(String[] args) {
//		info<String> i =new info<String>();
//		i.setKey("jike");
		
		
		info<Integer> i =new info<Integer>();
		i.setKey(11);
		tell(i);//jike
	}
	//?Í¨Åä·û
	public static void tell(info<?> i) {//info<Object> i
		System.out.println(i);//jike
	}
}

class info<T>{
	private T key;
	
	
	public void setKey(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
	
	
	public String toString() {//×÷ÓÃ
		return this.getKey().toString();
	}
	
}
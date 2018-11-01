package com.lianix.java3.fanxing;

public class FxffDemo {
	public static void main(String[] args) {
		ff  f =new ff();
		String str = f.tell("-jk-");
		System.out.println(str);
		int i =  f.tell(10);
		System.out.println(i);
 	}
}

class ff{
	public <T>T tell(T t) {
		return t;
	}
}
package com.lianix.java3.fanxing;
//·ºÐÍ½Ó¿Ú

interface interf1<T>{
	public void say();
}

class Inte11<T> implements interf1<T>{
	private String info;
	
	public Inte11(String info) {
		this.info = info;
	}
	
	
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	
	
	public void say() {
	}
}

public class JieKouFangXingDemo2 {
	public static void main(String[] args) {
		Inte11<String> inte1 =new Inte11<String>("jk*");
		System.out.println(inte1.getInfo());
	}
}

 
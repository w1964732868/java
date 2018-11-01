package com.lianix.java3.fanxing;
//·ºÐÍ½Ó¿Ú

interface interf<T>{
	public void say();
}

class Inte1 implements interf<String>{
	private String info;
	
	public Inte1(String info) {
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

public class JieKouFangXingDemo {

	public static void main(String[] args) {
		Inte1 inte1 =new Inte1("jk==");
		System.out.println(inte1.getInfo());
	}

}

 
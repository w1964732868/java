package com.lianix.java3.fanxing;

public class SheZhiDuoGeDemo {

	public static void main(String[] args) {
		MM<String,Integer> mm = new MM<String,Integer>();
		mm.setPassWord(140700048);//设置值
		mm.setName("xiaoming");
		System.out.println("用户名："+mm.getName()+"  "+"密码： "+mm.getPassWord());//得到设置的值
	}

}


class  MM<K,V>{
	private K name;
	private V passWord;
	
	
	public K getName() {
		return name;
	}
	public void setName(K name) {
		this.name = name;
	}
	public V getPassWord() {
		return passWord;
	}
	public void setPassWord(V passWord) {
		this.passWord = passWord;
	}
	
}
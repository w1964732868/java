package com.lianix.java3.fanxing;

public class SheZhiDuoGeDemo {

	public static void main(String[] args) {
		MM<String,Integer> mm = new MM<String,Integer>();
		mm.setPassWord(140700048);//����ֵ
		mm.setName("xiaoming");
		System.out.println("�û�����"+mm.getName()+"  "+"���룺 "+mm.getPassWord());//�õ����õ�ֵ
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
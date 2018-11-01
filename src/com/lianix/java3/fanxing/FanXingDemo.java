package com.lianix.java3.fanxing;

//地球经纬度 int float(精准) String
//new  set 输出get
class Point {
//	变量
	private Object x;
	private Object y;
//	set get
	public Object getX() {
		return x;
	}
	public void setX(Object x) {
		this.x = x;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object y) {
		this.y = y;
	}
}

public class FanXingDemo {
	public static void main(String[] args) {
		Point point = new Point();
		
//		point.setX(10);
//		point.setY(10);
		
		point.setX(10.f);
		point.setY(10.f);
		
//		int px = (Integer)point.getX();//自动拆箱
//		int py = (Integer)point.getY();
		
		float px1 = (Float)point.getX();//自动拆箱
		float py1 = (Float)point.getY();
		
//		System.out.println("x="+px+"   y="+py);
		System.out.println("x="+px1+"   y="+py1);
	}
}

package com.lianix.java3.fanxing;
//泛型

//地球经纬度 int float(精准) String
class Point1<T> {
	private T x;
	
	public T getX() {
		return x;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	private T y;
	
}

public class FanXingDemo2 {
//	---------------------------------------------------------
	public static void main(String[] args) {
		Point1<String> Point1 = new Point1<String>();
		Point1.setX("精度为:10");
		Point1.setY("维度为:10");
		System.out.println(Point1.getX()+"  "+Point1.getY());
		
		
		
		Point1<Integer> Point2 = new Point1<Integer>();
		Point2.setX(10);
		Point2.setY(10);
		System.out.println(Point2.getX()+"  "+Point2.getY());
	}
}

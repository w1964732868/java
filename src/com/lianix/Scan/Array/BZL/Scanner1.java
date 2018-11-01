package com.lianix.Scan.Array.BZL;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

//		next()接收控制台输入的字符串  空格/回车为结束           不能将空格作为字符串接收
//		nextLine()接收控制台输入的字符串 以回车为结束     可以接收部分空格
//		nextInt()
//		nextDouble()
//		nextBoolean() 小明  男

//		charAt(下标/索引) 栈               (new堆  地址)
//		从控制台输入
		Scanner scanner = new Scanner(System.in);// System.in 接收控制台的数据
//		System.out.println("姓名： ");
//		String name = scanner.next();

//		System.out.println("性别:");
//		char sex = scanner.next().charAt(0);//char要charAt()

//		System.out.println("年龄：");
//		int age = scanner.nextInt();

//		System.out.println("身高：");
//		double ss = scanner.nextDouble();

//	    将输入控制台的数据展示出来
//		System.out.println("Hi，大家好！ 我叫"+name +"，今年"+age+"岁，是身高"+ss+"的男士");
		
		
		System.out.println("输入分数：");
		int score = scanner.nextInt();
//		boolean isPass = score > 60;
//		System.err.println("60及格:"+score+isPass);
		if (score > 60) {
			System.out.println(score + "分，及格");
		} else {
			System.out.println(score + "分，不及格");
		}

//		逻辑运算的优先级：非（!） 与(&&) 或(||)
		System.out.println("输入5分制:");
		int score1 = scanner.nextInt();
		boolean isPass1 = score1 >= 0 && score1 <=5;
		System.out.println(score1+"是5分制分数:"+isPass1);

//		System.out.println("输入5分制:");
//		int score2 = scanner.nextInt();
//		boolean isPass2 = score2 < 0 || score2 >5;
//		System.out.println(score2+"是5分制分数:"+isPass2);

//		System.out.println("输入5分制:");
//		int score3 = scanner.nextInt();
//		boolean isPass3 = !(score3 < 0 || score3 >5);
//		System.out.println(score3+"是5分制分数:"+isPass3);

	}

}

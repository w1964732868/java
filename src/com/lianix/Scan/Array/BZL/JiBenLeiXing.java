package com.lianix.Scan.Array.BZL;

public class JiBenLeiXing {
	public static void main(String[] args) {
//    	8个基本数据类型
		// byte 8
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		// short 16
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println("包装类：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int 32
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
		System.out.println("包装类：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long 64
		System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
		System.out.println("包装类：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float 16
		System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double 64
		System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char 16
		System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
		System.out.println("包装类：java.lang.Character");
		// 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
		System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
		System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

		System.out.println("2的3次方：" + Math.pow(2, 8));

		// 平方根 round对小数点最后一位四舍五入 保留整数位
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = "
				+ Math.round(10 * (Math.sqrt(20) + Math.sqrt(10)) / (Math.sqrt(20) - Math.sqrt(10))) / 10.0);

		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20 + sqrt10) / (sqrt20 - sqrt10);
		result = Math.round(10 * result) / 10.0;
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10)) = " + result);

		String name = "张飞";
		char sex = '男';
		short age = 25;
		float height = 1.99f;
		String type = "豪放的";
		System.out.println("大家好, 我是" + name + "，今年" + age + "，我是一个" + type + "男士");

		name = "王妃";
		sex = '女';
		age = 33;
		System.out.println("大家好, 我是" + name + "，今年" + age + "，我是一个" + type + "女士");
//    练习    
		name = "小米3";
		System.out.println("手机品牌:" + name);
		String xitong = "android";
		System.out.println("操作系统:" + xitong);
		int cpu = 2;
		System.out.println("CPU数:" + cpu);
		float price = 1999.0f;
		System.out.println("价格:" + price);
//        浮点型
		double d = 2.6;
		double c = d - 2;
		System.out.println(c);// 0.6000000000000001 1运算的误差

		for (int i = 0; i <= 127; i++) {
			System.out.println((char) i + ":" + i);
		}
//    制表符
// \n换行
// \t制表符  右移8-10个空格
// \\表示
//        
		System.out.print('\u4e2d' + ":");// 中
		System.out.println(4 * Math.pow(16, 3) + 14 * Math.pow(16, 2) + 2 * Math.pow(16, 1) + 13); // e=16 d=13
		System.out.println((char) 20013 + ":" + 20013);
		System.out.println("我和你\n不在一行");
		System.out.println("\t我在这里显示");
		System.out.println("System.out.println(\"双引号也输出\");");

//        布尔类型
		boolean isPass;
		isPass = true;
		System.out.println("考试通过:" + isPass);
		isPass = false;
		System.out.println("考试没有通过:" + isPass);
		isPass = 65 > 60;
		System.out.println("65分的及格:" + isPass);
//        小类型向大类型转换 JVM做的
//        java默认+运算是int型的
		int i = -2;
		long l = i;
		System.out.println(i + ":" + Integer.toBinaryString(i));// 11111111111111111111111111111110
		System.out.println(l + ":" + Long.toBinaryString(l));// 1111111111111111111111111111111111111111111111111111111111111110
																// 前32补1 后32和上面一样
//		int(共32位  精度31位最高位符号位)  -> float(32位     尾数/ 精度是23位)    不会出现数据丢失  会出现丢失精度
		int a = 0x1000001; // 28位
		float f = a;
		System.out.println(Integer.toBinaryString(a) + ":" + a);// 1000000000000000000000001:16777217 16777217
		System.out.println(Integer.toBinaryString((int) f) + ":" + f);// 1000000000000000000000000:1.6777216E7
																		// 1.6777216*10^7 int（f）f转化为int
//        long(64位  36位尾数   63位精度) ->  double(64位  52位尾号/精度)
		long b = 0x20000000000001l; // 54位
		double b1 = b;
		System.out.println(Long.toBinaryString(b) + ":" + b);
		System.out.println(Long.toBinaryString((long) b1) + ":" + b1);
//       大类型 向 小类型转换  强转   源数据的数据位  变为    目标数据的符号位
		int i1 = 129;
		System.out.println(i1 + ":" + Integer.toBinaryString(i1)); // 10000001 -127
		byte bb = (byte) i1;
//        		-2^7（-128）    -  2^7-1 （127）
		System.out.println("2的7次方：" + Math.pow(2, 7));

		int i2 = 257;
		System.out.println(i2 + ":" + Integer.toBinaryString(i2)); // 1(丢失)00000001 +1
		byte bb1 = (byte) i2;
//      int (32位) 转为char(16位)
		char c1 = 66;// 65所对应的字符
		int i3 = 'B';// 字符B所对应的ASII码
		System.out.println(c1 + ":" + i3);

		char c2 = 'C';
		int i4 = c2 + 1;
		c2 = (char) (c2 + 1);
		System.out.println(c2 + ":" + i4);
	}
}

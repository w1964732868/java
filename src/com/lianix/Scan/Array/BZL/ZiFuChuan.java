package com.lianix.Scan.Array.BZL;

public class ZiFuChuan {

	public static void main(String[] args) {
//		字符串长度
		String str = " AaBb@";// ctrl+shift+F
//		System.out.println(str.length());
		// 字符串 转 数组
//		char date[] = str.toCharArray();
//		for (int i = 0; i < date.length; i++) {
//			System.out.print(date[i]+" ");
//		}
//		从字符串中提取字符 从0开始
//		System.out.println(str.charAt(3));
//		字符串和byte数组之间的转换
//		byte bytes[] = str.getBytes();
//		for (int i = 0; i < bytes.length; i++) {
////			System.out.print(bytes[i] + "  ");
////			System.out.println();
//			System.out.println(new String(bytes) + "\t");
//		}
//		过滤字符串的存在的字符indexOf()
//		System.out.println(str.indexOf("@"));

//		字符串去掉前后空格
//		System.out.println(str.trim());
//		从字符串中取出子字符串sunString()
//		大小写转换toLowerCase() toUpperCase()
//		判断字符串的开头结尾字符endWith() startWith()
//		替换String字符串中的一个字符：replace()
		
//		StringBulider和StringBuffer的比较
//		StringBulider 单线程是更快 append()追加    insert()插入
//		StringBuffer 安全
//		String不可以更改的 看到新的更改内容是 创建新的空间
		String sBuffer1 = "Hello";
		System.out.println("+++++++++++++String不可以更改的");
		System.out.println(sBuffer1.toString());
		tell(sBuffer1);
		System.out.println(sBuffer1.toString());
//		StringBuffer可以更改的
		System.out.println("+++++++++++++StringBuffer可以更改的");
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("jike11");
		sBuffer.insert(0, "Love");// 第一个参数 从哪里开始 第二个加什么内容 从0开始
		sBuffer.replace(0, 3, "I love ");// start, end, str 从0开始
		System.out.println(sBuffer.toString());
		tell(sBuffer);
		System.out.println(sBuffer.toString());
	}

//	StringBuffer可以更改的   常用发法  append()追加    insert()插入  replace() indexOf()
	public static void tell(StringBuffer s) {
		s.append("我");
//		System.out.println(s.toString());

	}

//	String不可以更改的 看到新的更改内容是 创建新的空间
	public static void tell(String s) {
		s = "我";
	}
}

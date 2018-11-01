package com.lianix.Scan.Array.BZL;

public class JiBenLeiXing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		System.out.println();	
//		int a = (int) 100l;
//		for (int i = 0; i < a.length; i++) {

		int[] a = new int[20];
		try {
			for (int i = 0; i < 21; i++) {
				a[i] = i + 1; // 小心 怎么会把a[i] 错写成int[i]呢
				System.out.println(i + 1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("数组越界");
		}

	}

}
//Ctrl+/ 注释

//Ctrl+D  删除
//Alt+上下键  移动代码
//Ctrl+Shift+上下键   旋转-----
//Shift+Enter 自动换行

//Alt+/ 代码提示  idea不一样
//ctrl+1   F2 快捷修复 idea没有
//Ctrl+Alt+上下键  快速复制---  idea找函数名
//Ctrl+M  放大工作区    idea ctrl+1
//Ctrl+F11  执行  idea不是

//ctrl+shift+M调出输入法 全拼  ctrl+shift+F 繁简切换

//Ctrl+Shift+o
package com.wayne.io.c2.digui;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 递归： 函数自身直接或者间接的调用了自身
		 * 
		 * 注意： 1〉递归一定明确条件。否则容易栈溢出
		 */
		// show();

		// toBin(8);

		int sum = getSum(50);

		System.out.println(sum);

	}

	public static int getSum(int i) {
		// TODO Auto-generated method stub
		if (i == 1)
			return 1;
		return i + getSum(i - 1);
	}

	public static void toBin(int i) {
		// TODO Auto-generated method stub

		/*
		 * return; 1〉返回值类型为void的一般函数都有一个默认的return语句
		 * 2〉void仅仅表示该一般函数没有返回值，但默认的return语句-〉结束被调函数，返回给主调函数 3〉函数执行结束之后会立马释放即出栈
		 * 
		 * 构造函数/类 1〉无法独立运行，主要给main函数服务-〉为函数初始化
		 * 
		 */

		if (i > 0) {
			toBin(i / 2);
			System.out.println(i % 2);
		}
	}

	/*
	 * public static void show() { // TODO Auto-generated method stub
	 * 
	 * method(); }
	 * 
	 * public static void method() { // TODO Auto-generated method stub
	 * 
	 * show(); }
	 */

}

﻿/*
 *面试：请使用LinkedList来模拟一个堆栈或者队列数据结构
 *
 *堆栈：先进后出 First In Last Out  FILO
 *
 *队列：先进先出 First In First Out  FIFO
 *
 *应该描述这样一个容器，给使用者提供一个容器对象完成这两种结构中的一种
 *
 *
 */

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()){
			System.out.println(dl.myGet());
		}
	}

}

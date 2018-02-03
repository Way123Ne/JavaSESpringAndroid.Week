package wayne.c3.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// demo_1();

		demo_2();
	}

	public static void demo_2() {
		// TODO Auto-generated method stub
		
		/*
		 *如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行操作
		 *
		 *如果数组中的元素是基本数据类型数值，那么会将数组作为集合中的元素进行存储
		 *
		 */
		
		int[] arr = {45,78,20,64};//Integer[]为对象
		
		List<int[]> list = Arrays.asList(arr);

		System.out.println(list);//将数组引用为一个元素进行存储，打印出一个

	}

	public static void demo_1() {

		/*
		 * 重点：List asList(数组)将数组转成集合
		 *
		 * 好处：其实可以使用集合的方法操作数组中的元素 注意：数组的长度是固定的，所以对于集合的增删改查方法是不可以使用的
		 * 否则会发生UnsupportedOperationException
		 *
		 */

		String[] arr = { "abc", "haha", "xixi" };

		// boolean b = myContains(arr,"xixi");
		// System.out.println(b);

		List<String> list = Arrays.asList(arr);
		boolean b = list.contains("xixi");
		System.out.println("b=" + b);
		// list.add("heihei"); //UnsupportedOperationException

		System.out.println(list);
	}

	public static boolean myContains(String[] arr, String key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key))
				return true;
		}
		return false;
	}

}


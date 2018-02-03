package wayne.c3.toolclass.arrays.demo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Arrays:集合框架的工具类。里面的方法都是静态的
		 * 
		 */
		
		int[] arr = {4,5,8,12,36};
		
		System.out.println(Arrays.toString(arr));
	}
	
	//toString的经典实现
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		if (iMax == -1)
			return "[]";
		
		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0; ;i++){
			b.append(a[i]);
			if(i == iMax)
				return b.append(']').toString();
			b.append(',');
			
		}
	}

}

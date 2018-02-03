package wayne.c2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Collections:是集合框架的工具类 里面的方法均为静态的
		 * 
		 */

		demo_5();
	}

	public static void demo_5() {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("abca");
		list.add("cba");
		list.add("kjsdaui");
		list.add("abca");
		list.add("we");
		System.out.println(list);
		
		//将list集合中的元素全部替换
		// Collections.fill(list, "IO");
		// System.out.println(list);
		
		//将list集合中的元素随机取出
		//Collections.shuffle(list);
		//System.out.println(list);
		
		/*
		 * 将非同步集合list转换成同步集合[提高多线程安全性]
		 * 
		 *  非同步的list:
		 *  List list = new ArrayList(); 
		 *  
		 *  返回一个同步的list:
		 *  list = Collections.synchronizedList(list);
		 *  
		 */
		
		Collections.synchronizedList(list);								
		System.out.println(list);
		
	}

}

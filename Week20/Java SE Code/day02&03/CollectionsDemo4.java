package wayne.c2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Collections:是集合框架的工具类 里面的方法均为静态的
		 * 
		 */

		demo_4();
	}

	public static void demo_4() {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("abca");
		list.add("cba");
		list.add("dewgj");
		
		System.out.println(list);
		Collections.replaceAll(list, "cba", "nba"); //set(indexOf("cba","nba"));
		System.out.println(list);	
	}

}

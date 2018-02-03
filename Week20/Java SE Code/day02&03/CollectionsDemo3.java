package wayne.c2.toolclass.collections.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Collections:是集合框架的工具类 里面的方法均为静态的
		 * 
		 */

		demo_3();
	}
	
	/*
	public static void demo_3() {
		// TODO Auto-generated method stub
		
		TreeSet<String> st = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int temp = o2.compareTo(o1);
				return temp;
			}
		});
		st.add("abca");
		st.add("cba");
		st.add("kjsdaui");
		st.add("we");
		
		System.out.println(st);
	}
	*/
	
	public static void demo_3() {
		// TODO Auto-generated method stub
		
		//TreeSet<String> st = new TreeSet<String>();
		TreeSet<String> st = new TreeSet<String>(Collections.reverseOrder());
		st.add("abca");
		st.add("cba");
		st.add("kjsdaui");
		st.add("we");
		
		System.out.println(st);
	}
	

}

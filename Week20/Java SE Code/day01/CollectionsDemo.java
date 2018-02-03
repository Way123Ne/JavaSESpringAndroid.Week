package wayne.c2.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import wayne.c2.comparator.ComparatorByLength;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Collections:是集合框架的工具类 里面的方法均为静态的
		 * 
		 */

		demo_1();
	}

	public static void demo_1() {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("abca");
		list.add("cba");
		list.add("kjsdaui");
		list.add("abca");
		list.add("we");
		System.out.println(list);

		// 对List集合中的元素进行指定顺序的排序
		// Collections.sort(list);
		// mySort(list);
		
		Collections.sort(list,new ComparatorByLength());
		System.out.println(list);
	}

	public static <T extends Comparable<? super T>> void mySort(List<T> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).compareTo(list.get(j)) > 0) {
					// T temp = list.get(i);
					// list.set(i, list.get(j));
					// list.set(j, temp);

					Collections.swap(list, i, j);
				}
			}
		}

	} 

}

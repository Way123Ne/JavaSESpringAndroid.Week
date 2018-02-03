package wayne.c7.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();	
		al.add("abc");
		al.add("hehehe");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(8);
		
		printCollection(al);
		printCollection(al2);
	}
		/*
		 * 迭代并打印集合中的元素
		 * 
		 */
		
		public static void printCollection(Collection<?> al) {
			// TODO Auto-generated method stub
			Iterator<?> it =al.iterator();
			while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

}

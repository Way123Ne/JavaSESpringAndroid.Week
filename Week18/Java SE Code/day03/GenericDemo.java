import java.util.ArrayList;

import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abac");//public boolean add(Object obj);
		al.add("cd");
		al.add("ko");
	  //al.add(5); //al.add(new Integer(5));
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		/*泛型的补偿机制：
		 * 
		 * Class clazz = "ko".getClass();
		 * clazz.getName();
		 * 
		 */

	}

}

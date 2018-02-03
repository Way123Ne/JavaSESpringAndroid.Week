import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
	}

	public static void show(Collection c1, Collection c2) {
		// TODO Auto-generated method stub
		
		//给c1添加元素
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//给c2添加元素
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		
		//演示addAll
		//c1.addAll(c2);//将c2添加到c1中
		//System.out.println("c1:" + c1);
		
		//演示removeAll
		//boolean b = c1.removeAll(c2);//将两个集合中相同的元素从调用removeAll的集合中删除
		//System.out.println("removeAll:" + b);
		//System.out.println("c1:" + c1);
		
		//演示containsAll
		//boolean b = c1.containsAll(c2);
		//System.out.println("containsAll:" + b);
		//System.out.println("c1:" + c1);
		
		//演示retainAll
		boolean b = c1.retainAll(c2);//取交集，保留和指定集合相同的元素，而删除不同的元素
		//System.out.println("retainAll:" + b);
		System.out.println("c1:" + c1);	
	}

}

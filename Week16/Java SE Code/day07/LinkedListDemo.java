import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
		
	//	System.out.println(link.getFirst()); //获取第一个元素但不删除
		
	//	System.out.println(link.removeFirst());//获取第一个元素但会删除
	//  System.out.println(link.removeLast());	
		
		while(!link.isEmpty()){
			System.out.println(link.removeFirst());
		}
		System.out.println(link);
		
	}

}

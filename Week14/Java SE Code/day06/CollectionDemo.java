import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection coll = new ArrayList();
		show(coll);
	}

	public static void show(Collection coll) {
		// TODO Auto-generated method stub
		
		//1〉添加元素
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		//2〉清除元素
	//	coll.remove("abc2");//会改变集合的长度
		
		//清空集合
		coll.clear();
		
		System.out.println(coll.contains("abc5"));
		
		System.out.println(coll);	
	}
	
}

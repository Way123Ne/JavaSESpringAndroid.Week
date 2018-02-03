import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		// TODO Auto-generated method stub

		// 添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);

		// 删除元素
		// System.out.println("remove:"+list.remove(2));
		// System.out.println(list);

		// 设置元素
		//System.out.println("set:" + list.set(1, "abc5"));
		//System.out.println(list);
		
		//获取元素
		//System.out.println("get:" + list.get(0));
		//System.out.println(list);
		
		//获取子列表 ,包含头，不包含尾
		System.out.println("subList:" + list.subList(1, 2));
		System.out.println(list);	
	}

}

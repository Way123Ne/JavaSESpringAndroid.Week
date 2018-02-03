import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
	
		//添加元素
		System.out.println(map.put(5, "xiaoqiang"));
		System.out.println(map.put(5, "kele"));
		map.put(3, "lisi");
		map.put(6, "wangcai");
		
		//删除元素
		System.out.println("remove:" + map.remove(3));
		
		//判断元素
		System.out.println("contains:" + map.containsKey(3));
		//获取元素
		System.out.println("get:" + map.get(6));
		
		System.out.println(map);
	}

}

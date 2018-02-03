package wayne.c1.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

		hm.put(2,"zhouliu");
		hm.put(5,"wangcai");
		hm.put(6,"lisi");

		Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

		while(it.hasNext()){
			Map.Entry<Integer,String> me = it.next();
			
			Integer Key = me.getKey();
			String Value = me.getValue();
			
			System.out.println(Key + ":" + Value);
			
		}
	}

}

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import wayne.c3.comparator.ComparatorByName;
import wayne.p2.bean.Student;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeMap<Student,String> tm = new TreeMap<Student,String>(new ComparatorByName());
		
		tm.put(new Student("Tom",20),"北京");
		tm.put(new Student("Kayler",24),"上海");
		tm.put(new Student("Tony",31),"沈阳");
		tm.put(new Student("Will",28),"大连");
		tm.put(new Student("Joe",24),"铁岭");
		
		
		Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Student,String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
	}

}

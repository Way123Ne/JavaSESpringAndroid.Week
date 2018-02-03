import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import wayne.p2.bean.Student;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 将学生对象和学生的归属地通过键与值存储到map集合中。
		 * 
		 */
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		
		hm.put(new Student("lisi", 20),"beijing");
		hm.put(new Student("Tom", 22),"London");
		hm.put(new Student("Tony", 33),"NewYork");
		hm.put(new Student("Jackson", 45),"Paris");
		hm.put(new Student("Jackson", 45),"Korean");
		
		//Set<Student> keyset = hm.keySet();
		//Iterator<Student> it = keyset.iterator();
		
		 Iterator<Student> it = hm.keySet().iterator();
		 
		while(it.hasNext()){
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName() + "--" + key.getAge() + "--" + value);
		}
		
	}

}

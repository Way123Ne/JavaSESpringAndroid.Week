import java.util.HashSet;
import java.util.Iterator;

import wayne.c.arraylist.test.Person;
/*
 * 往HashSet集合中存储Person对象，如果姓名和年龄相同，被视为同一个元素
 */
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new Person("lisi4", 24));
		hs.add(new Person("lisi6", 26));
		hs.add(new Person("lisi9", 29));
		hs.add(new Person("lisi4", 24));

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "--" + p.getAge());
		}
	}

}

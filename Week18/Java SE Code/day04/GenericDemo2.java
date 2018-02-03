import java.util.Iterator;
import java.util.TreeSet;

import wayne.c3.comparator.ComparatorByName;
import wayne.p2.bean.Person;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi",22));
		ts.add(new Person("wangcai",29));
		ts.add(new Person("zhangliu",30));
		ts.add(new Person("xiaozhao",15));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}
	}

}

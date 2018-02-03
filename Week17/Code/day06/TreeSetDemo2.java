import java.util.Iterator;

import java.util.TreeSet;

import wayne.p.bean.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet(new ComparatorByName());
		/*
		 * 以Person对象年龄从小到大的排序
		 */
		ts.add(new Person("lisi", 20));
		ts.add(new Person("zhouer", 25));
		ts.add(new Person("lili", 28));
		ts.add(new Person("wangwu", 30));
		ts.add(new Person("zhaoxiao", 28));
		 
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName() + "--" + p.getAge());
		}
	}
	
	public static void Demo1(){
		TreeSet ts = new TreeSet();
		ts.add("abc");
		ts.add("dcd");
		ts.add("jhc");
		ts.add("nba");
		ts.add("aec");
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}

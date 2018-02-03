package wayne.c7.generic.advance.demo;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

import wayne.p2.bean.Person;
import wayne.p2.bean.Student;
import wayne.p2.bean.Worker;

public class GenericAdvanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Worker> al = new ArrayList<Worker>();	
		al.add(new Worker("abc", 25));
		al.add(new Worker("heihei", 23));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("wangli",12));
		al2.add(new Student("xiaoming",15));
		
		
	//	ArrayList<String> al3 = new ArrayList<String>();
	//	al2.add("jk");
	//	al2.add("ooy");
		
		printCollection(al);
		printCollection(al2);
	//	printCollection(al3);
	}
	
	public static void printCollection(Collection<? extends Person> al) { //Collection<dog> al = new ArrayList<dog>();
		// TODO Auto-generated method stub
		Iterator<? extends Person> it =al.iterator();
		while(it.hasNext()){
	//	System.out.println(it.next().toString());
		Person p = it.next();
		System.out.println(p.getName() + ":" + p.getAge());
	}
  }

}

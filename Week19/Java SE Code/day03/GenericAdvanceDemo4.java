package wayne.c7.generic.advance.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import wayne.c3.comparator.ComparatorByName;
import wayne.p2.bean.Person;
import wayne.p2.bean.Student;
import wayne.p2.bean.Worker;

public class GenericAdvanceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> al1 = new TreeSet<Person>(new CompByName());	
		al1.add(new Person("abc2", 25));
		al1.add(new Person("abc5", 23));
		al1.add(new Person("abc4", 30));
		
		TreeSet<Student> al2 = new TreeSet<Student>(new CompByStuName());
		al2.add(new Student("stu5",12));
		al2.add(new Student("stu9",15));
		al2.add(new Student("stu2",18));
		
		TreeSet<Worker> al3 = new TreeSet<Worker>(new CompByWorkerName());
		al3.add(new Worker("kayla", 42));
		al3.add(new Worker("David", 25));
		al3.add(new Worker("Song", 28));
		
		TreeSet<String> al4 = new TreeSet<String>();
		al4.add("ancd");
		
	  //al1.addAll(al2);
	  //al1.addAll(al4); //错误，类型不匹配
		
	 //	System.out.println(al1.size());
		
		/*
		Iterator<Person> it = al1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		/*
		Iterator<Student> it = al2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		Iterator<Worker> it = al3.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}

/*
 * class TreeSet<E>{
 *		 Tree(Comparator<? super E> comp){
 *			
 *			}
 * }
 * 
 * 什么时候使用下限？通常对集合中的元素进行取出操作时，可以使用下限
 * 
 */

class CompByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int temp = o1.getName().compareTo(o2.getName());
		return temp == 0 ? o1.getAge()-o2.getAge() : temp;
	}
	
}

class CompByStuName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int temp = o1.getName().compareTo(o2.getName());
		return temp == 0 ? o1.getAge()-o2.getAge() : temp;
	}
	
}

class CompByWorkerName implements Comparator<Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		int temp = o1.getName().compareTo(o2.getName());
		return temp == 0 ? o1.getAge()-o2.getAge() : temp;
	}
	
}

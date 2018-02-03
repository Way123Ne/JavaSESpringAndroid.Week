package wayne.c7.generic.advance.demo;

import java.util.ArrayList;
import wayne.p2.bean.Person;
import wayne.p2.bean.Student;
import wayne.p2.bean.Worker;

public class GenericAdvanceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> al1 = new ArrayList<Person>();	
		al1.add(new Person("abc", 25));
		al1.add(new Person("heihei", 23));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("wangli",12));
		al2.add(new Student("xiaoming",15));
		
		ArrayList<Worker> al3 = new ArrayList<Worker>();
		al3.add(new Worker("kayla", 42));
		al3.add(new Worker("David", 25));
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("ancd");
		
		al1.addAll(al2);
	  //al1.addAll(al4); //错误，类型不匹配
		
		System.out.println(al1.size());
	
	}

}

/*
 *一般在存储元素的时候都是用上限，因为这样取出都是按照上限类型来运算的。不会出现类型安全隐患
 *
 */

class MyCollection<E>{
	public void add(E e){
		
	}
	
	public void addAll(MyCollection<? extends E> e){
		
	}

}

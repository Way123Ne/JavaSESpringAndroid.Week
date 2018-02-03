package wayne.c7.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import wayne.p2.bean.Person;
import wayne.p2.bean.Student;
import wayne.p2.bean.Worker;

public class GenericAdvanceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-genePersonmethod stub
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("songqiang", 13));
		al.add(new Person("xiaoxue", 17));
		
		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add(new Person("abc2222", 13));
		al2.add(new Person("abc4222", 17));
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abc");
		al4.add("abcdee");
		
	//	al.containsAll(al4);
		
	//	"abc".equals(new Person("hahaha", 45));
		
		printCollection(al);
	}

	private static void printCollection(Collection<?> al) {
		// TODO Auto-generated method stub
			Iterator<?> it =al.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
		}
	 }
}

class MyCollection2<E>{
	public boolean containsAll(Collection<?> coll){
		
		return true;
		
	}
}



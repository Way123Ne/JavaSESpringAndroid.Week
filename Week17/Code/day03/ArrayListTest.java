import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1", 21));
		al.add(new Person("lisi2", 22));
		al.add(new Person("lisi3", 23));
		al.add(new Person("lisi4", 24));

		Iterator it = al.iterator();
		while (it.hasNext()) {
		//	System.out.println(((Person) it.next()).getName() + "--" + ((Person) it.next()).getAge());
			Person p = (Person) it.next();
			System.out.println(p.getName() + "--" + p.getAge());
		}
	}

}

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new LinkedHashSet();	
		hs.add("hahaa");
		hs.add("xixix");
		hs.add("pipip");
		hs.add("heiheih");
		hs.add("hahaa");
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	}
	}
}

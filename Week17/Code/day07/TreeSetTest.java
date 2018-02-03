import java.util.Iterator;

import java.util.TreeSet;

import wayne.c7.comparator.ComparatorByLength;

/*
 * 对字符串长度进行排序
 */
public class TreeSetTest {
	public static void main(String args[]){

	TreeSet ts = new TreeSet(new ComparatorByLength());
	ts.add("aaaa");
	ts.add("aefa");
	ts.add("bbc");
	ts.add("aakka");
	ts.add("ar");
	
	Iterator it = ts.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
  }
}


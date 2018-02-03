package wayne.c4.news.demo;

//import static java.util.Collections.sort;
//import static java.util.Collections.max;

import static java.util.Collections.*;//静态导入，其实是导入类中的静态成员
import static java.lang.System.*;//静态导入，其实是导入类中的静态成员
import java.util.ArrayList;
import java.util.List;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc5");
		list.add("abc6");

		out.println(list);

		sort(list);
		out.println(list);

		String max = max(list);
		out.println("max=" + max);
	}

}

package wayne.c1.map.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Map在有映射关系时，可以优先考虑
		 * 
		 * 在查表法中的应用较为多见
		 * 
		 */

		String week = getWeek(1);
		System.out.println(week);
		
		//String gwm = getWeekbyMap("星期二");
		//System.out.println(gwm);
		System.out.println(getWeekbyMap("星期二"));
	}
	
	public static String getWeekbyMap(String week){
		Map<String, String> map = new HashMap<String, String>();
		map.put("星期一", "Mon");
		map.put("星期二", "Tue");
		map.put("星期三", "Wed");
		return map.get(week);	
	}

	public static String getWeek(int week) {
		// TODO Auto-generated method stub

		if (week < 1 || week > 7)
			throw new RuntimeException("没有对应的星期，请重新输入");
		
		String[] weeks = {"","星期一","星期二"};
		
			return weeks[week];
	}

}

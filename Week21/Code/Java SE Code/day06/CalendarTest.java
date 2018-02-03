package wayne.c3.otherapi.system;

import java.util.Calendar;

/*
 * 练习：求每一年的2月有多少天;求当前日期与现在日期的时间差
 * 
 * 思路：求每年的3月1日向前偏移一天的日期即可；同理
 */
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();

		// c.set(2015, 11, 9);
		// c.add(Calendar.DAY_OF_MONTH, 24); //c.add()方法设置向前向后的日期偏移量
		// showDays(c);

		int year = 2012;
		showDays1(year);

	}

	public static void showDays1(int year) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);

		showDays1(c);
	}

	public static void showDays1(Calendar c) {
		// TODO Auto-generated method stub
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;// java中月份从0开始计
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "年" + month + "月" + day + "日");
	}

}

package wayne.c3.otherapi.system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 练习：
 * "2014-5-13"到"2017-1-7"
 * 中间有多少天？
 * 思路：
 * 两个日期相减就可以实现
 * 怎么相减？
 * 必须要有两个可以进行减法运算的数
 * 毫秒值可以进行相减。如何获取毫秒值？通过date对象
 * 如何获取date对象？可以将字符串转成date对象
 * 
 * 1>将日期格式的字符串转成Date对象
 * 2>将Date对象转成毫秒值
 * 3>相见，在变成天数
 * 
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String str_date1 = "2014-5-13";
		String str_date2 = "2017-1-7";
		test(str_date1, str_date2);
	}

	public static void test(String str_date1, String str_date2) throws ParseException {
		// TODO Auto-generated method stub

		// 1>将日期字符串转成日期对象
		// 定义日期格式对象
		DateFormat dateFormat = DateFormat.getDateInstance();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);

		long time1 = date1.getTime();
		long time2 = date2.getTime();

		long time = Math.abs(time1 - time2);
		int day = myDay(time);
		System.out.println(day);

	}

	public static int myDay(long time) {
		// TODO Auto-generated method stub
		
		int day = (int) (time/1000/60/60/24);
		return day;
	}

}

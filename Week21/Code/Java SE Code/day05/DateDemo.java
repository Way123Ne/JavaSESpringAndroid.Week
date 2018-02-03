package wayne.c3.otherapi.system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		MethodDemo_3();
	}

	/**
	 * 将如期格式的字符串--〉日期对象 使用的是DateFormat类中的parse()方法
	 * 
	 * @throws ParseException
	 * 
	 */
	public static void MethodDemo_3() throws ParseException {
		// TODO Auto-generated method stub
		String str_date = "2012年4月19日";
		// str_date = "2015---8---20";

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

		// dateFormat = new SimpleDateFormat("yyyy---MM---dd");

		Date date = dateFormat.parse(str_date);

		System.out.println(date);
	}

	/**
	 * 对日期对象进行格式化 将日期对象-->日期格式的字符串 使用的是DateForm类中的format方法--〉重点
	 * 
	 */
	public static void MethodDemo_2() {
		// TODO Auto-generated method stub
		Date date = new Date();

		// 获取日期格式对象。具备这默认的风格.FULL LONG等可以指定风格
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		// System.out.println(dateFormat);

		// 如何使日期的风格变为自定义的格式？
		dateFormat = new SimpleDateFormat("yyyy--MM--dd");

		String str_date = dateFormat.format(date);
		System.out.println(str_date);
	}

	/**
	 * 日期对象和毫秒值之间的转换
	 * 
	 * 毫秒值--〉日期对象 1>通过Date对象的构造方法 new Date(timeMillis); 2>还可以通过setTime设置
	 * 因为可以通过Date对象的方法对该日期中的各个字段(年月日)进行操作
	 * 
	 * 日期对象--〉毫秒值 1>getTime方法 因为可以通过具体的数值进行运算
	 * 
	 */
	public static void MethodDemo_1() {
		long time = System.currentTimeMillis();
		// System.out.println(time);//1488943084413

		Date date = new Date();// 将当前日期和时间封装成Date对象
		System.out.println(date);// Wed Mar 08 11:20:05 CST 2017

		// 通过Date对象的构造方法 new Date(timeMillis);//将指定毫秒值封装成Date对象
		Date date2 = new Date(1488943084413l);
		System.out.println(date2);
	}

}

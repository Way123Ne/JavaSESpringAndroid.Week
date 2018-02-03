﻿package com.wayne.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 正则表达式对字符串的常见操作
		 * 
		 * 1〉匹配 其实使用的是String 类中的matches方法
		 * 
		 * 2〉切割：其实使用的就是String类中的split方法
		 * 
		 * 3〉替换:其实使用的就是String类中的replaceAll()方法
		 * 
		 * 4〉获取
		 */
		// functionDemo_1();
		// functionDemo_2();
		//functionDemo_3();
		functionDemo_4();
	}

	/*
	 * 获取：
	 * 	将正则表规则进行对象的封装
	 * Pattern p = Pattern.compile("a*b");
	 *
	 *通过正则对象的matcher方法与要获取的字符串相关联。获取要对字符串进行操作的匹配器对象Matcher
	 *Matcher m = p.matcher("aaaaab"); 
	 * 
	 * 通过Matcher匹配器对象的方法对字符串进行操作
	 * boolean b = m.matches();
	 */
	public static void functionDemo_4() {
		// TODO Auto-generated method stub
		
		String str = "da jia hao,ming tian bu fang jia!";
		
		String regex = "\\b[a-z]{3}\\b";
		
		//1>将正则封装成对象
		Pattern p = Pattern.compile(regex);
		//2>通过正则对象获取匹配器对象
		Matcher m = p.matcher(str);
		
		//使用Matcher对象的方法对字符串进行操作
		//既然要获取三个字母组成的单词
		//使用Matcher的查找方法.find();
		System.out.println(str);
		while(m.find()){
			System.out.println(m.group());//获取匹配的字序列
		
			System.out.println(m.start()+":"+m.end());
		}
	}

	/*
	 * 替换
	 */
	public static void functionDemo_3() {
		// TODO Auto-generated method stub
		
		String str = "zhangsanttttxiaoqiangmmmmmmmmmzhaoliu";
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		
		String tel = "15800001111"; //158****1111;
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
	
		System.out.println(tel);
	}

	/*
	 * 切割
	 */
	public static void functionDemo_2() {
		// TODO Auto-generated method stub
		String str = "zhangsantttttxiaoqiangmmmmmmmmmmmmmzhaoliu";

		String[] names = str.split("(.)\\1+"); // str.split("\\.");

		for (String name : names) {
			System.out.println(name);
		}
	}

	/*
	 * 匹配
	 */
	public static void functionDemo_1() {
		// TODO Auto-generated method stub

		// 匹配手机号码是否正确
		String tel = "158000000111";

		String regex = "1[358]\\d{9}";// [0-9] == \d

		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}

}

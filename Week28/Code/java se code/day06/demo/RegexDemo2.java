package com.wayne.regex.demo;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 正则表达式对字符串的常见操作
		 * 1〉匹配
		 * 		其实使用的是String 类中的matches方法
		 * 
		 * 2〉切割
		 * 
		 * 3〉替换
		 * 
		 * 4〉获取
		 */
		functionDemo_1();
	}

	public static void functionDemo_1() {
		// TODO Auto-generated method stub
		
		//匹配手机号码是否正确
		String tel = "158000000111";
		
		String regex = "1[358]\\d{9}";//[0-9] == \d
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":"+b);
	}

}

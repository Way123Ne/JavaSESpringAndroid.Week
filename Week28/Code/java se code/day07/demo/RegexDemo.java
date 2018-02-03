package com.wayne.regex.demo;

/*
 * 正则表达式
 * 
 * 正则表达式用于操作字符串数据
 * 通过一些特殊的符号来体现的
 * 所以我们为了掌握正则表达式，必须要学习一些符号
 * 
 * 虽然简化了，但是阅读性差
 */
public class RegexDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String qq = "123456";
		
		//CheckQQ(qq);
		
		String regex = "[1-9][0-9]{2,12}";

		// boolean b = qq.matches(regex);
		// System.out.println(qq + ":" + b);
		
		String str = "aoooooooob";
		String reg = "ao{4,}b";
		boolean b = str.matches(reg);
		System.out.println(str+":"+b);
	}
	
	/*
	 * 需求：定义一个功能对QQ号进行校验
	 * 要求：长度5~15,只能是数字，0不能开头
	 * 
	 */
	
	public static void CheckQQ(String qq) {
		// TODO Auto-generated method stub
		
		int len = qq.length();
		
		if(len>=5 && len<=15){
			if(!qq.startsWith("0")){
				try{
					long l = Long.parseLong(qq);
					
					System.out.println(l+":正确");
				}catch(NumberFormatException e){
					System.out.println(qq+":含有非法字符");
				}
			}else{
				System.out.println(qq+":不能0开头");
			}
		}else{
			System.out.println(qq+":长度错误");
		}
	}
	
}


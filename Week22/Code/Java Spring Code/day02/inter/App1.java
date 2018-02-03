package com.wayne.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/inter/beans.xml");
		//获取，不同接口
		// UpperLetter changeLetter = (UpperLetter) ac.getBean("changeLetter");
		// System.out.println(changeLetter.change());
		
		//使用接口来访问bean
		ChangeLetter changeLetter = (ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
	}

}

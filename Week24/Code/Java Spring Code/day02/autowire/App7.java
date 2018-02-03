package com.wayne.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/autowire/beans.xml");
		
		Master ms= (Master) ac.getBean("master");
		System.out.println(ms.getName()+"养了一条"+ms.getDog().getAge()+"岁的"+ms.getDog().getName());
	}

}

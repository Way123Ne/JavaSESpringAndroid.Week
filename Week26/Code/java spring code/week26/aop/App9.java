﻿package com.wayne.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/aop/beans.xml");
		TestServiceInter tsi = (TestServiceInter) ac.getBean("proxyFactoryBean");
		tsi.sayHello();
		((TestServiceInter2)tsi).sayBye();
	}

}

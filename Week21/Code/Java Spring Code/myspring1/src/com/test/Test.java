package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ByeService;
import com.service.UserService;
import com.utli.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 先使用传统的方法，来调用UserService中的sayHello()方法
		UserService userService = new UserService();
		userService.setName("Wayne");
		userService.sayHello();*/
		
		//现在使用Spring来完成上面的任务
		//1.得到spring的applicationContext对象(容器对象)
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService) ac.getBean("userService");
		//us.sayHello();	//NullPointerException
		
		((UserService) ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
		
		// 从ac[代表ApplicationContext容器]中get byService的bean
		// ByeService bs = (ByeService) ac.getBean("byeService");
		// bs.sayBye();
	}

}

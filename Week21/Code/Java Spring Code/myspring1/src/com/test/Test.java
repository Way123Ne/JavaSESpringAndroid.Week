package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ByeService;
import com.service.UserService;
import com.utli.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ��ʹ�ô�ͳ�ķ�����������UserService�е�sayHello()����
		UserService userService = new UserService();
		userService.setName("Wayne");
		userService.sayHello();*/
		
		//����ʹ��Spring��������������
		//1.�õ�spring��applicationContext����(��������)
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService) ac.getBean("userService");
		//us.sayHello();	//NullPointerException
		
		((UserService) ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
		
		// ��ac[����ApplicationContext����]��get byService��bean
		// ByeService bs = (ByeService) ac.getBean("byeService");
		// bs.sayBye();
	}

}

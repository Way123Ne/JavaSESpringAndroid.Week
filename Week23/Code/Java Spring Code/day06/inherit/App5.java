package com.wayne.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/inherit/beans.xml");
		
		Graduate graduate = (Graduate) ac.getBean("graduate");
		System.out.println(graduate.getName()+""+graduate.getAge()+""+graduate.getDegree());
	}

}

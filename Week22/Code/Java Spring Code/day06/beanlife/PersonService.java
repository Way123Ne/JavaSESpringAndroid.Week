package com.wayne.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public PersonService(String abc){
		System.out.println("PersonService 函数");
	}
	
	public PersonService(){
		System.out.println("PersonService 函数");
	}
	
	public void sayHi(){
		System.out.println("hi"+":" + name);
	}

	//arg0表示得到正在被实例化的bean id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName 被调用值" + arg0);
		
	}

	//该方法可以传递beanFactory
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory"+arg0);
		
	}

	//该方法传递ApplicationContext
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext"+arg0);
	}

	//也可以通过注解的方式来配置哪个方法init-method
	@PostConstruct
	public void init(){
		System.out.println("我自己的init方法");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}
	
	//定制我们自己的销毁方法
	@PreDestroy
	public void mydestory(){
		System.out.println("释放各种资源");
	}
}

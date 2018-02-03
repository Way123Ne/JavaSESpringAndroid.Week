package com.wayne.c3.io.bean;

import java.io.Serializable;
/*
 * Serializable:用于给被序列化的类加入ID号
 * 用于判断类和对象是否是同一个版本
 * 请求的文件 ->matchID <-回应的文件
 */
public class Person implements Serializable/*标记接口*/{
	/**
	 * transient:非静态数据不想被序列化可以使用这个关键字修饰
	 * 
	 * 瞬间和静态的数据  无法被序列化
	 */
	private static final long seriaVersionUID = 47475L;
	public transient String name;
	private static int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

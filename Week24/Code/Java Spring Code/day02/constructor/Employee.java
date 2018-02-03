﻿package com.wayne.constructor;

public class Employee {

	private String name;
	private int age;
	
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
	
	public Employee(){
		
	}
	
	public Employee(String name, int age) {
		super();
		System.out.println("Employee(String name, int age) 函数被调用..");
		this.name = name;
		this.age = age;
	}
	
}

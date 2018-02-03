package com.wayne.aop;

public class TestService implements TestServiceInter{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("hi:"+name);
	}
	
	public void sayBye(){
		System.out.println("bye:"+name);
		//int i=9/0;
	}

}

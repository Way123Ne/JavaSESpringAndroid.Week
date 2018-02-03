package com.wayne.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.wayne.bean.Person;

public class ReflectDemo2 {

	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		createNewObject_2();
	}

	public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		//com.wayne.bean.Person p = new com.wayne.bean.Person("小强",39);
	
		/*
		 * 当获取指定名称对应类中的所体现的对象时
		 * 而该对象初始化不使用空参构造该怎么办？
		 * 既然是通过指定的构造函数进行对象的初始化
		 * 所以应该先获取到构造函数，通过字节码文件对象即可完成
		 * 该方法是：getConstructor(paramterTypes);
		 * 
		 */
		String name = "com.wayne.bean.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象
		Class clazz = Class.forName(name);
		//获取到了指定的构造函数对象
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		//通过构造器对象的newInstance方法进行对象的初始化
		Object obj = constructor.newInstance("lisi",54);
	}

	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		// 早期：new时候，先根据被new的类的名称找寻该类的字节码文件，并夹在进内存
		// 并创建该字节码文件对象，并接着创建该字节文件的对应的Person对象
		// com.wayne.bean.Person p = new com.wayne.bean.Person();

		// 现在：
		// String name = "com.wayne.bean.Person";
		// 找寻该名称类文件，并加载进内存，并产生Class对象
		// Class clazz = Class.forName(name);
		// 如何产生该类的对象？
		// Object obj = clazz.newInstance();
	}

}

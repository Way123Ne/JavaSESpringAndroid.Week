package com.wayne.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.wayne.bean.Person;

public class ReflectDemo4 {
	
	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		getMethodDemo_3();
	}

	public static void getMethodDemo_3() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.wayne.bean.Person");
		
		Method method = clazz.getMethod("paramMethod", String.class,int.class);
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "kayler",27);
	}

	public static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.wayne.bean.Person");
		
		Method method = clazz.getMethod("show", null);
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, null);
	}

	public static void getMethodDemo() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class clazz = Class.forName("com.wayne.bean.Person");
		
		Method[] methods = clazz.getMethods();//获取的都是公有的方法
		methods = clazz.getDeclaredMethods();//只获取本类中的所有方法，包含私有方法
		for(Method method : methods){
			System.out.println(method);
		}
	}

}
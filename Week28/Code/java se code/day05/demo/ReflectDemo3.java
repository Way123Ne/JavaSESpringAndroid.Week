package com.wayne.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.wayne.bean.Person;

public class ReflectDemo3 {
	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		getFieldDemo();
	}

	public static void getFieldDemo() throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class clazz = Class.forName("com.wayne.bean.Person");

		Field field = null;// clazz.getField("age"); //只能获取共有的

		field = clazz.getDeclaredField("age");// 只获取本类，但包含私有

		// 对私有字段的访问取消权限进行检查 。 暴力访问/强制访问
		field.setAccessible(true);

		Object obj = clazz.newInstance();

		field.set(obj, 75);

		Object o = field.get(obj);

		System.out.println(o);
	}

}
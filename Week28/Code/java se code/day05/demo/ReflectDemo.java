package com.wayne.reflect.demo;

import com.wayne.bean.Person;

/*
 *java反射机制是在运行状态中，对于任意一个类(class)文件，都能够知道这个类的所有属性和方法 
 * 对于任意一个对象，都能够调用它的任意一个方法和属性
 * 这种动态的信息以及动态调用对象的方法的功能称为java语言的反射机制
 * 
 * 动态获取类中信息，就是java反射
 * 可以理解为对类的解剖
 * 
 * 要想对字节码文件进行解剖，必须要有字节码文件对象
 * 如何获取字节码文件对象？
 */
public class ReflectDemo {

	/**
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//getClassObject_1();
		
		//getClassObject_2();
		
		getClassObject_3();
	}
		
	/*
	 * 方式三:
	 * 只要通过给定的类的字符串名称就可以获取该类，更为扩展
	 * 可是用Class类中的方法完成
	 * 该方法就是forName
	 * 
	 */
	public static void getClassObject_3() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String className = "com.wayne.bean.Person";
		
		Class clazz = Class.forName(className);
		
		System.out.println(clazz);
	}

	/*
	 * 方式二：
	 * 2〉任何数据类型都具备一个静态的属性.class来获取其对应的Class对象
	 * 相对简单，但是还是要明确用到的类中的静态成员
	 * 但这种方法的扩展性不够
	 * 
	 */
	public static void getClassObject_2() {
		// TODO Auto-generated method stub
		
		Class clazz = Person.class;
		
		Class clazz1 = Person.class;
		System.out.println(clazz==clazz1);
	}

	
	/*
	 * 获取字节马对象的方式一：
	 * 1〉Object类中的getClass()方法的
	 * 
	 */

	public static void getClassObject_1(){
		Person p = new Person();
		Class clazz = p.getClass();
		
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz==clazz1);
	}

}

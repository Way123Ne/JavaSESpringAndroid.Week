package com.wayne.io.c3.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Map
		 * 		|--Hashtable
		 * 			|--Properties:
		 * 
		 * Properties集合：
		 * 特点：
		 * 1>该集合中的键和值都是字符串类型
		 * 2〉集合中的数据可以保存到流中，或者从流中获取
		 * 
		 * 通常该集合用于操作以键值对形式存在的配置文件
		 * 
		 */
		PropertiesDemo_2();
	}

	public static void PropertiesDemo_2() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();

		// 存储元素
		prop.setProperty("zhangsan", "20");
		prop.setProperty("wangwu", "27");
		prop.setProperty("lisi", "10");
		prop.setProperty("wangcai", "80");
		
		//想要将这些集合中的字符串键值信息持久化存储到文件中
		//需要关联输出流
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		//将集合中数据存储到文件中，使用store方法
		prop.store(fos, "name");

		fos.close();
	}

	/*
	 *演示Properties集合和流对象相结合的功能 
	 */
	
	/*
	 * Properties集合的存和取
	 * 
	 */
	public static void PropertiesDemo() {
		// TODO Auto-generated method stub

		// 创建一个Properties集合

		Properties prop = new Properties();

		// 存储元素
		prop.setProperty("zhangsan", "20");
		prop.setProperty("wangwu", "27");
		prop.setProperty("lisi", "10");
		prop.setProperty("wangcai", "80");
		
		//prop = System.getProperties();
		prop.list(System.out);
		
		// 修改元素
		prop.setProperty("wangwu", "12");

		// 取出所有元素
		Set<String> names = prop.stringPropertyNames();

		for (String name : names) {
			String value = prop.getProperty(name);
			System.out.println(name + ":" + value);
		}
	}

}

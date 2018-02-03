package com.wayne.io.c3.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {

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
		//PropertiesDemo_3();
		
		//myLoad();
		
		Properties_test();
	}

	public static void Properties_test() throws IOException {
		// TODO Auto-generated method stub
		
		//读取这个文件
		File file = new File("info.txt");
		if((!file.exists())){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		//FileWriter fw = new FileWriter(file); 会再次创建一个file对象中的info.txt文件--〉覆盖掉源文件
		//创建集合存储配置信息
		Properties prop = new Properties();
		
		//将流中信息存储到集合中
		prop.load(fr);
		
		prop.setProperty("wangwu", "12");
		
		FileWriter fw = new FileWriter(file);
		
		prop.store(fw,"");
		
		fw.close();
	}

	//模拟以下load方法
	public static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("=");
		
			System.out.println(arr[0]+"::"+arr[1]);
		}
		
		bufr.close();
	}

	public static void PropertiesDemo_3() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		//集合中的数据来自于一个文件
		//注意：必须要保证该文件中的数据是键值对
		//需要使用到读取流
		
		FileInputStream fis = new FileInputStream("info.txt");
		
		//使用load方法
		prop.load(fis);
		
		prop.list(System.out);
		
	}

}

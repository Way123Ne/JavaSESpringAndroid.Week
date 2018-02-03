package com.wayne.io.c1.file.demo;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		listDemo();
	}

	public static void listDemo() {
		// TODO Auto-generated method stub
		
		File file = new File("c:\\abc");
		
		/*
		 * 获取当前目录下的文件以及文件夹的名字。包含隐藏文件
		 * 调用list方法的File对象中封装的必须是对象
		 * 否则会发生NullPointException
		 * 如果访问的是系统级目录也会发生空指针异常
		 * 
		 * 如果目录存在但是没有内容，会返回一个数组，但是长度为0
		 */
		
		String[] names = file.list();
		System.out.println(names.length);
		
		for(String name:names){
			System.out.println(name);
		}
	}

}

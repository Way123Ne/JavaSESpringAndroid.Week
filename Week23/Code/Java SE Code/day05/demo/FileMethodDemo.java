package com.wayne.io.c1.file.demo;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * File对象的常见方法
		 * 
		 * 1.获取 1.1 获取文件名称 1.2获取文件路径 1.3获取文件大小 1.4获取文件修改时间
		 * 
		 * 2.创建与删除 boolean
		 * 
		 * 3.判断
		 * 
		 * 4.重命名
		 * 
		 * 5.系统根目录和容量获取
		 *
		 */

		// getDemo();
		// createAndDeleteDemo();
		// isDemo();
		// renameToDemo();
		listRootsDemo();
	}

	//5.系统根目录和容量获取
	public static void listRootsDemo() {
		// TODO Auto-generated method stub

		File file = new File("d:\\");

		System.out.println("getFreeSpace:" + file.getFreeSpace());
		System.out.println("getTotalSpace:" + file.getTotalSpace());
		System.out.println("getUsableSpace:" + file.getUsableSpace());

		/*
		 * File[] files = File.listRoots(); 
		 * for(File file: files){
		 * System.out.println(file); }
		 */
	}

	//4.重命名
	public static void renameToDemo() {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\J2ee workspace\\day22e\\file.txt");

		File f2 = new File("D:\\aaa.txt");

		boolean b = f1.renameTo(f2);

		System.out.println("b=" + b);
	}

	//3.判断
	public static void isDemo() throws IOException {
		// TODO Auto-generated method stub
		// File f = new File("a.txt");
		File f = new File("aaa");

		f.mkdir();
		// f.createNewFile();

		// boolean b = f.exists();
		// System.out.println("b="+b);

		// 最好先判断是否存在
		// System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

	//2.创建与删除 boolean
	public static void createAndDeleteDemo() throws IOException {
		// TODO Auto-generated method stub

		// 1>创建多级文件夹
		File dir = new File("abc\\a\\e\\ee\\yt");
		boolean b3 = dir.mkdirs();
		System.out.println("b3=" + b3);
		System.out.println(dir.delete()); // 只是删除abc文件夹的最根文件夹-〉yt

		// 2>创建一个文件夹
		// File dir = new File("abc");

		// boolean b2 = dir.mkdir();
		// System.out.println("b2="+b2);

		// System.out.println(dir.delete());
		// //windows从里往外删除文件，如果一个文件夹里有文件则无法删除-〉先删除里

		// 3>文件的创建和删除
		// File file = new File("file.txt");

		/*
		 * 和输出流不一样，如果文件不存在，则创建，如果文件存在，则不创建
		 */

		// boolean b = file.createNewFile();
		// System.out.println("b="+b);
	}

	public static void getDemo() {
		File file = new File("E:\\J2ee workspace\\day22e\\a.txt");
		// File file = new File("a.txt");

		String name = file.getName();

		String absPath = file.getAbsolutePath();// 绝对路径

		String path = file.getName();// 相对路径

		long len = file.length();

		long time = file.lastModified();

		Date date = new Date(time);

		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

		String str_time = dateFormat.format(date);

		System.out.println("parent:" + file.getParent());

		System.out.println("name:" + name);
		System.out.println("absPath:" + absPath);
		System.out.println("paht:" + path);
		System.out.println("time:" + time);
		System.out.println("str_time:" + str_time);
	}

}

package com.wayne.io.transstream.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TransStreamDemo3 {

	public static void main(String[] args) throws IOException {

		// writeText();

		// writeText_2();
		
		//writeText_3();

		// readText();

		readText_2();
	}

	public static void readText_2() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk_1.txt"), "UTF-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf, 0, len);
		System.out.println(str);

		isr.close();
	}

	public static void readText() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("gbk_1.txt");

		char[] buf = new char[10];
		int len = fr.read(buf);
		String str = new String(buf, 0, len);
		System.out.println(str);

		fr.close();
	}

	public static void writeText_3() throws IOException {
		// TODO Auto-generated method stub
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf_8.txt"));

		osw.write("你好");

		osw.close();
	}
	
	public static void writeText_2() throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_3.txt"), "GBK");

		/*
		 * 这两句代码的功能是等同的
		 * FileWriter:其实就是转换流指定了本机默认码表的体现。而且这个转换流的子类对象，可以方便操作文本文件
		 * 		简单说：操作文件的字节流+本机默认的编码表
		 * 		这是按照默认码表来操作文件的便捷类
		 * 
		 * 如果操作文本文件需要明确具体的编码。FileWriter就不行了。此时必须使用转换流
		 */
		
		osw.write("你好");

		osw.close();
	}

	public static void writeText() throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("gbk_1.txt");

		fw.write("你好");

		fw.close();
	}

}

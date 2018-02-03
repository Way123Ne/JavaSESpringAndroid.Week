package com.wayne.io.c5.print.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * PrintStream:
		 * 1>提供了打印方法可以对多种数据类型值进行打印，并保持其数据的表示形式
		 * 2〉它不抛出IOException
		 * 
		 * 构造函数，接收三种类型的值
		 * 1〉字符串路径
		 * 2〉File对象
		 * 3〉字节数出流
		 * 
		 */
		
		PrintStream out = new PrintStream("print.txt");
		
		// int by = read();
		// write(by);
		
		//out.write(97); //a 只写最低8位   0110 0001
		
		out.write(610);//只写最低8位
		
		//out.print(97);//将97变成字符保持原样将数据打印到目的地
		
		out.close();
	}

}

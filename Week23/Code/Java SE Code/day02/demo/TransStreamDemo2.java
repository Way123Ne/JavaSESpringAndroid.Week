package com.wayne.io.transstream.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TransStreamDemo2 {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */

	// 字节字符互相转换--〉在文件中写数据保存在硬盘中(硬盘中数据以字节形式保存)
	// 字符字节互相转换--〉从文件中读取数据展现在面前(从硬盘中读取数据)

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 1>需求：将键盘录入的数据写入到一个文件中
		 * 
		 * 2>需求：将一个文本文件中的内容显示在控制台上
		 * 
		 * 3>需求：将一个文本文件中的内容复制到另一个文件中
		 */
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));

		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt")));

		String line = null;

		while ((line = bufr.readLine()) != null) {
			if ("over".equals(line))
				break;
			// System.out.println(line.toUpperCase());
			// osw.write(line.toUpperCase()+"\r\n");
			// osw.flush();

			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
	}
}

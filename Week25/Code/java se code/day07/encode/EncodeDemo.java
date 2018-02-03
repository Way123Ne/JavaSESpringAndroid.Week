package com.wayne.c8.io.encode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 字符串--〉字节数组:编码
		 * 字节数组-->字符串：解码
		 * 
		 * 你好: GBK:-60 -29 -70 -61
		 * 你好:UTF-8:-28 -67 -96 -27 -91 -67
		 * 
		 * 如果编错了，解不出来
		 * 如果编对了，解错了，有可能有救
		 * 
		 */
		String str = "你好";
		
		//编码
		byte[] buf = str.getBytes("gbk");
		
		String s1 = new String(buf,"iso8859-1");
		
		System.out.println("s1="+s1);
		
		//printBytes(buf);
		
		//解码
		byte[] buf2 = s1.getBytes("iso8859-1"); //获取源字节
		String s2 = new String(buf,"GBK");
		
		System.out.println("s2="+s2);
	}

	public static void printBytes(byte[] buf) {
		// TODO Auto-generated method stub
		
		for(byte b : buf){
			System.out.println(b+"");
		}
	}

}

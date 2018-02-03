package com.wayne.net.c2.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrowser {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket s = new Socket("192.168.0.101",8080);
		
		//模拟浏览器，给tomcat服务端发送符合http协议的请求消息
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("GET /myweb/2.html HTTP/1.1");
		out.println("Accept: */*");
		out.println("Host: 192.168.0.102:8080");
		out.println("Connection: close");
		out.println();
		out.println();
		
		//接收服务端返回的数据
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		String str = new String(buf,0,len);
		System.out.println(str);
		
		s.close();
	}

}

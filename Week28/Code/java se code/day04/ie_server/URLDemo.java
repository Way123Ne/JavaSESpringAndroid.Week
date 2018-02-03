package com.wayne.net.c2.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str_url = "file:///E:/server/apache-tomcat-7.0.73/myweb/2.html";

		URL url = new URL(str_url);

		// System.out.println("getProtocol:"+url.getProtocol());
		// System.out.println("getHost:"+url.getHost());
		// System.out.println("getPort:"+url.getPort());
		// System.out.println("getFile:"+url.getFile());
		// System.out.println("getPath:"+url.getPath()); 
		// System.out.println("getQuery:"+url.getQuery());

		// InputStream in = url.openStream();
		
		// 获取url对象的Url连接器对象,将连接封装成了对象:java中内置的可以解析的具体协议的对象+socket
		URLConnection conn = url.openConnection();

		// String value = conn.getHeaderField("content-Type");
		// System.out.println(value);
		
		//System.out.println(conn);
		//sun.net.www.protocol.http.HttpURLConnection:http://192.168.0.101:8080/myweb/2.html
		
		 InputStream in = conn.getInputStream();
		 byte[] buf = new byte[1024];
		 int len = in.read(buf);
		
		 String text = new String(buf,0,len);
		
		 System.out.println(text);
		
		 in.close();
	}

}

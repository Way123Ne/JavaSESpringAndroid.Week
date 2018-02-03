package com.wayne.net.c5.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {
	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 *客户端输入字母数据，发送给服务端 
		 * 服务端收到后显示在控制台，并将该数据转成大写返回给客户端
		 * 直到客户端输入over，转换结束
		 * 
		 * 创建一个英文大写转换服务器
		 * 
		 * 分析：
		 * 有客户端和服务端，使用tcp传输
		 * 
		 */
		
		/*
		 * 思路：
		 * 客户端：
		 * 1〉需要先有socket端点
		 * 2〉客户端的数据源：键盘
		 * 3〉客户端的目的：socket
		 * 4>接收服务端的数据，源：socket
		 * 5>将数据在控制台上显示出来：目的：控制台
		 * 6〉在这些流中操作的数据，都是文本数据
		 * 
		 * 转换客户端：
		 * 1〉创建socket客户端对象
		 * 2〉获取键盘录入
		 * 3〉将录入的信息发送给socket输出流
		 * 
		 */
		
		//1>创建socket客户端对象
		Socket s = new Socket("192.168.0.101",2690);
		
		//2>获取键盘录入
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//3>socket输出流
		//new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4>socket输入流，读取服务端返回的大写数据
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line = bufr.readLine())!=null){
			
			if("over".equals(line))
				break;
			
			out.println(line);
			
			//readLine()阻塞导致客户端和服务端都等待，需换行标记结束键盘录入
			//out.print(line+"\r\n");
			//out.flush();
			
			//读取服务端发回的一行大写数据
			String upperStr = bufIn.readLine();
			System.out.print(upperStr);
		}
		
		s.close();
		
	}

}

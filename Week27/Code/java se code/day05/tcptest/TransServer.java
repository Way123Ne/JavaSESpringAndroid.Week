package com.wayne.net.c5.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 转换服务端：
		 * 分析：
		 * 1〉serversocket服务
		 * 2〉获取socket对象
		 * 3〉源：socket,读取客户端发过来的需要转换的数据
		 * 4〉目的：显示在控制台上
		 * 5〉将数据转换成大写发给客户端
		 */
		
		//1>serverSocket服务
		ServerSocket ss = new ServerSocket(2690);
		
		//2〉获取socket对象
		Socket s = ss.accept();
		
		//获取ip
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		//3>获取socket读取流，并装饰
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4>获取socket的输出流，并装饰
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null){
			
			System.out.println(line);
			out.println(line.toUpperCase());
		
			//readLine()阻塞导致客户端和服务端都等待，需换行标记结束键盘录入
			//out.print(line.toUpperCase()+"\r\n");
			//out.flush();
		}
		s.close();
		ss.close();
	}

}

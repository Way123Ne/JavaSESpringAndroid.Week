﻿package com.wayne.net.c4.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		//客户端数据发送到服务端
		/*
		 * TCP传输：客户端建立的过程
		 * 1>创建tcp客户端socket服务。使用的是Socket对象
		 * 		建议该对象一床创建就明确目的地。要连接的主机
		 * 2〉如果连接建立成功，说明数据传输通道已建立
		 * 		该通道就是socket流，是底层建立好的。既然是流，说明既有输入，又有输出
		 * 		想要输入或者输出流对象，可以找Socket来获取
		 * 		可以通过getOutputStream(),和getInputStream()来获取两个字节流
		 * 3〉使用输出流，将客户端数据写出
		 * 4>关闭资源
		 * 
		 */
		
		//创建客户端socket服务
		Socket socket = new Socket("192.168.0.102",11246);
		
		//获取socket流中的输出流
		OutputStream out = socket.getOutputStream();
		
		//使用输出流将指定的数据写出去
		out.write("tcp演示：哥们又来了!".getBytes());
		
		//关闭资源
		socket.close();
	}

}

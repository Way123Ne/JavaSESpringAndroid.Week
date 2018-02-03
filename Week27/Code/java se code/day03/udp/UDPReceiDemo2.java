﻿package com.wayne.net.c2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiDemo2 {
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("接收端启动.......");
		
		/*
		 * 创建UDP接收端的思路
		 * 1>建立udp socket服务
		 * 2〉创建数据包，用于存储收到的数据。方便用数据包对象的方法解析这些数据
		 * 3〉使用socket服务的receive方法将接收的数据存储到数据包中
		 * 4>通过数据包的方法解析数据包中的数据
		 * 5>关闭资源
		 * 
		 */
		
		//1〉建立udp socket服务
		DatagramSocket ds = new DatagramSocket(2580);
		
		while(true){
		//2>创建数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3>使用接收方法将数据存储到数据包中
		ds.receive(dp); //阻塞式
		
		//4>通过数据包对象的方法，解析其中的数据，比如，地址，断口，数据内容
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		
		System.out.println(ip+":"+port+":"+text);
		}
		
		//5>关闭资源
		//ds.close();
		
	}

}

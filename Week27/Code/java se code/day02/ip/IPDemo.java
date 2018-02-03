package com.wayne.c1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 */

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		//获取本地主机ip地址对象
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其它主机的ip地址对象
		ip = InetAddress.getByName("www.baidu.com");//InetAddress.getByName("WAYNE_PC");
		
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}

}

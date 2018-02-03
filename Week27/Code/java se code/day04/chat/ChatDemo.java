package com.wayne.net.c3.chat;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DatagramSocket sendmes = new DatagramSocket();
		DatagramSocket receimes = new DatagramSocket(2560);
		
		// SendMes sm = new SendMes(sendmes);
		// ReceiMes rm = new ReceiMes(receimes);
		
		new Thread(new SendMes(sendmes)).start();
		new Thread(new ReceiMes(receimes)).start();
	
	}

}

package com.wayne.net.c3.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiMes implements Runnable {

	private DatagramSocket ds;

	public ReceiMes(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				// 2>创建数据包
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				// 3>使用接收方法将数据存储到数据包中
				ds.receive(dp); // 阻塞式

				// 4>通过数据包对象的方法，解析其中的数据，比如，地址，断口，数据内容
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());

				System.out.println(ip + ":" + port + ":" + text);

				if (text.equals("886")) {
					System.out.println(ip + "...推出聊天室");
				}
			}
		} catch (Exception e) {

		}
	}

}

﻿package com.wayne.net.c6.uploadtext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		

		// 1
		ServerSocket ss = new ServerSocket(9869);

		// 2,
		Socket s = ss.accept();

		System.out.println(s.getInetAddress().getHostAddress() + ".....connected");

		// 3,
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		// 4,
		BufferedWriter bufw = new BufferedWriter(new FileWriter("c:\\hi\\server.txt"));

		String line = null;

		while ((line = bufIn.readLine()) != null) {

			bufw.write(line);
			
		}

		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.println("上传成功");

		bufw.close();

		s.close();
		ss.close();

	}

}
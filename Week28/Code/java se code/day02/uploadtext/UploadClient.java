package com.wayne.net.c6.uploadtext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {
	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		File file = new File("c:\\pic\\client.txt");
		System.out.print(file.exists());
		
		//1
		Socket s = new Socket("192.168.0.102",9869);
		
		//2 
		BufferedReader bufr = new BufferedReader(new FileReader("c:\\pic\\client.txt"));
		
		//3
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			out.println(line);
		}
		
		//4
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();
	}

}

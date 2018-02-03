package com.wayne.c7.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ByteArrayStream不能操作较大数据
		ByteArrayInputStream bis = new ByteArrayInputStream("abcad".getBytes());
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int ch = 0;
		
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		System.out.println(bos.toString());
	}

}

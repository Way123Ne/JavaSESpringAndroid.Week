package com.wayne.io.c6.sequence.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ���󣺽�1.txt 2.txt 3.txt�ļ��е����ݺϲ���һ���ļ���		*/
		
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		// v.add(new FileInputStream("1.txt"));
		// v.add(new FileInputStream("2.txt"));
		// v.add(new FileInputStream("3.txt"));
	
		// Enumeration<FileInputStream> en = v.elements();
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int x=1;x<=3;x++){
			al.add(new FileInputStream(x+".txt"));
		}
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		
		/*
		   �����ڲ����ڷ��ʾֲ�������Ҫ���ֲ�����final��
		 final Iterator<FileInputStream> it = al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {

			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				// TODO Auto-generated method stub
				return it.next();
			}
			
		};
		*/
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("1234.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
	}

		fos.close();
		sis.close();
	}
}

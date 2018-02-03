package wayne.c8.io.bytestream.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp3Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//	copy_4();
		
	//	copy_3();
		
	//	copy_2();
		
		copy();
	}

	//建议使用
	public static void copy() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away.mp3");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away_1.mp3");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		 
		while ((len=fis.read(buf))!=-1)
			fos.write(buf,0,len);
		
		fos.close();
		fis.close();
		
	}

	/*
	  //建议使用
	  public static void copy_2() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away.mp3");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away_2.mp3");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		int bt = 0;
		
		while((bt=bufis.read())!=-1){
			bufos.write(bt);
		}
		
		bufos.close();
		bufis.close();
	}*/

	/*
	 //不建议使用
	 public static void copy_3() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away.mp3");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away_3.mp3");
		
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		fos.write(buf);
		fos.close();
		fis.close();	
	}*/

	/*//不建议使用，没有效率
	public static void copy_4() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away.mp3");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Public\\Music\\Sample Music\\Sleep Away_4.mp3");

		int bt = 0;

		while ((bt = fis.read()) != -1) {
			fos.write(bt);
		}

		fos.close();
		fis.close();
	}
*/
}

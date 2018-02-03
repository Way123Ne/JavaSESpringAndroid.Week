package wayne.c7.io.bytestream.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// demo_write();

		// 1.创建字节读取流对象，用于和指定文件关联
		FileInputStream fis = new FileInputStream("bytedemo.txt");
		// System.out.println(fis.available());

		// byte[] buf = new byte[fis.available()];
		// fis.read(buf);
		// System.out.println(new String(buf));

		// 建议使用这种数据存储方式
		 byte[] buf = new byte[1024];
		 int len = 0;
		
		 while ((len = fis.read(buf)) != -1) {
		 System.out.println(new String(buf, 0, len));
		 }

		// int bt = 0;
		// while ((bt=fis.read())!=-1){
		// System.out.println(bt);
		// }

		// 一次读取一个字节
		// int bt = fis.read();
		// System.out.println(bt);
		//
		// fis.close();
	}

	/*public static void demo_write() throws IOException {
		// 1.创建字节输出流对象，用于操作文件
		FileOutputStream fos = new FileOutputStream("bytedemo.txt");

		// 2.写数据，直接写入到目的地中 fos.write("abcdjdf".getBytes());

		// fos.flush();本身没有刷新方法。继承父类，并且父类中的方法也是空方法

		fos.close(); // 关闭资源动作需要完成

	}*/

}

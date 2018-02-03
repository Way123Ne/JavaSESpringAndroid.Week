package wayne.c2.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 使用read(char[])读取文本文件的数据
		 * 
		 * 先创建字符数组
		 */

		FileReader fr = new FileReader("demo.txt");

		char[] buf = new char[1024];

		int len = 0;
		while ((len = fr.read(buf)) != -1){
			System.out.println(new String(buf,0,len));
		}

		// int num = fr.read(buf); // 将读取到的字符存储到数组中
		// System.out.println(num + ":" + new String(buf, 0, num));
		// int num1 = fr.read(buf);
		// System.out.println(num1 + ":" + new String(buf, 0, num1));
		// int num2 = fr.read(buf);
		// System.out.println(num2 + ":" + new String(buf));
	}

}

package wayne.c1.io.charsstream.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：作业：将e盘的一个文本文件复制到d盘
 * 
 * 思路：
 * 1>需要读取源
 * 2>将读到的源数据写入到目的地
 * 3>既然是操作文本数据，使用字符流
 * 
 */
public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1>读取一个已有的文本文件，使用字符流和文件相关联
		FileReader fr = new FileReader("IO流_2.txt");
		//2>创建一个临时目的，用于存储读到的数据
				FileWriter fw = new FileWriter("d:\\copytext_1.txt");
		//3>频繁的读写操作
				int ch = 0;
				while ((ch=fr.read())!=-1){
					fw.write(ch);
				}
		//4>关闭流资源
				fw.close();
				fr.close();
	}

}

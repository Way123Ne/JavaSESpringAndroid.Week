package wayne.c1.io.charsstream.test;

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
public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args){
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("IO流_2.txt");
			fw = new FileWriter("d:\\copytest_2.txt");
			
			//创建一个临时容器，用于缓存读取到的字符
			char[] buf = new char[BUFFER_SIZE];
			
			//定义一个变量记录读取到的字符数（起始就是往数组里装的字符个数）
			int len = 0;
			while((len=fr.read(buf))!=-1){
				fw.write(buf, 0, len);
			}
		} catch(Exception e){
			
		}finally{
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}
}

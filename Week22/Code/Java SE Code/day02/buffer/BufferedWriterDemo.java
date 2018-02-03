package wayne.c2.io.charsstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("buf.txt");

		//为了提高写入的效率。使用了字符流的缓冲区
		//创建一个字符写入流的缓冲区对象，并和指定要被缓冲的对象相关联
		BufferedWriter bufw = new BufferedWriter(fw);

		//使用缓冲区的写入方法将数据先写入到缓冲区中
		// bufw.write("abdjhdwkh"+LINE_SEPARATOR+"haha");
		// bufw.write("xixixi");
		// bufw.newLine();
		// bufw.write("heheh");

		
		for (int i = 0; i < 5; ++i){
			bufw.write("ahdjdj"+i);
			bufw.newLine();
			bufw.flush();
		}

		//关闭缓冲区。其实关闭的就是被缓冲的流对象
		bufw.close();

		//fw.write("hehe");

		//fw.close();
	}

}

package wayne.c4.io.charstream.mybuffer;

import java.io.IOException;
import java.io.Reader;

/**
 * 自定义的读取缓冲区，其实就是模拟一个BufferedReader
 * 
 * 分析：
 * 缓冲区中无非就是封装了一个数组
 * 并对外提供了更多的方法对数组进行访问
 * 起始这些方法最终操作的都是数组的角标
 * 
 * 缓冲的原理：
 * 其实就是从源中获取一批数据装进缓冲区中
 * 再从缓冲区中不断的取出一个一个数据
 * 
 * 在此次取完数据后，再从源中继续取一批数据放入缓冲区
 * 当源中的数据取光时，用-1作为结束标记
 * @author Wayne
 *
 */
public class MyBufferedReader extends Reader{

	private Reader r;
	
	//定义一个数组作为缓冲区
	private char[] buf = new char[1024];
	
	//定义一个指针用于操作这个数组中的元素。当操作到最后一个元素后，指针应该归零
	private int pos = 0;
	
	//定义一个计数器用于记录缓冲区中的数据个数。当该数据减到0，就从源中继续获取数据到缓冲区中
	private int count = 0;
	
	MyBufferedReader(Reader r){
		this.r = r;
	}
	
	/**
	 * 该方法从缓冲区中一次取出一个字符
	 * @return
	 * @throws IOException
	 */
	public int myRead() throws IOException{
		if(count == 0){
			count = r.read(buf);
			pos = 0;
		}
		if(count<0)
			return -1;
		
		char ch = buf[pos++];
		
	//	pos++;
		count--;
		
		return ch;
		
		
		/*
		 //从源中获取一批数据放入到缓冲区中。需要先做判断，只有计数器为0时，才需要从源中获取数据
		if (count == 0){
			count = r.read(buf);
			
			if (count<0)
				return -1;
			
			//每次获取数据到缓冲区后，角标应该归零
			pos = 0;
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
			
		}else if(count>0){
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
			}*/
		}
	
	public String myReadLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead())!=-1){
			
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			//将从缓冲区读到的字符，存储到缓存行数据的缓冲区中
			sb.append((char)ch);
		}
		
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	
	public void myClose() throws IOException{
		r.close();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int read(char[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
}

package wayne.c4.io.charsstream.mybuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("buf.txt");
		MyBufferedReader bufr = new MyBufferedReader(fr);

		String line = null;

		while((line=bufr.myReadLine())!=null){
			System.out.println(line);
		}
		
		bufr.myClose();

	}

}

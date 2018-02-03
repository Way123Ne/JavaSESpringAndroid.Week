package wayne.c6.charstream.linenumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("IO流_2.txt");
		LineNumberReader lnr = new LineNumberReader(fr);

		String line = null;
		lnr.setLineNumber(1);
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	}

}

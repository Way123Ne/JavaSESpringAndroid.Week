package wayne.c1.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\demo.txt"); // java.io.FileNotFoundException

			fw.write("abcde" + LINE_SEPARATOR + "hahaha");

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (fw != null)
				try {
					fw.close(); // java.lang.NullPointerException
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("关闭失败");
				}
		}

	}

}

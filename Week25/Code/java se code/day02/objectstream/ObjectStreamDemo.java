package com.wayne.c2.io.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.wayne.c3.io.bean.Person;

public class ObjectStreamDemo {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// writeObj();
		readObj();
	}

	public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));

		// 对象的反序列化
		Person p = (Person) ois.readObject();

		System.out.println(p.getName() + " " + p.getAge());

		ois.close();
	}

	public static void writeObj() throws IOException, IOException {
		// TODO Auto-generated method stub

		// 存储对象的文件一般其扩展名都是以.object结尾
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));

		// 对象序列化。被序列化的对象必须实现Serilizable
		oos.writeObject(new Person("小强", 20));

		oos.close();
	}

}

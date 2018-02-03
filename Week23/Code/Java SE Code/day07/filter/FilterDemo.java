package com.wayne.io.c3.filter;

import java.io.File;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FilterDemo();
		// FilterDemo_2();
		FilterDemo_3();

	}

	public static void FilterDemo_3() {
		// TODO Auto-generated method stub

		File dir = new File("c:\\");

		String[] names = dir.list(new SuffixFilter(".txt"));

		for (String name : names) {
			System.out.println(name);
		}

	}

	public static void FilterDemo_2() {
		// TODO Auto-generated method stub
		File dir = new File("c:\\");
		File[] files = dir.listFiles(new FilterByHidden());

		for (File file : files) {
			System.out.println(file);
		}
	}

	public static void FilterDemo() {
		// TODO Auto-generated method stub

		File dir = new File("c:\\");

		String[] names = dir.list(new FilterByJava());

		for (String name : names) {
			System.out.println(name);
		}
	}

}

package com.wayne.io.c3.filter;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByJava implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub

		System.out.println(dir + "---" + name);

		return name.endsWith(".java");
	}

}

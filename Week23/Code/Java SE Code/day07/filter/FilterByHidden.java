package com.wayne.io.c3.filter;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter {

	@Override
	public boolean accept(File pathName) {
		// TODO Auto-generated method stub
		
		return pathName.isHidden();
	}

}

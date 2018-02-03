package com.wayne.io.c1.file.test;

import java.io.File;

public class RemoveDirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("e:\\demodir");
		
		//dir.delete();
		removeDir(dir);
	}

	public static void removeDir(File dir) {
		// TODO Auto-generated method stub
		
		File[] files = dir.listFiles();
		
		for(File file:files){
			if(file.isDirectory()){
				removeDir(file);
			}else{
				System.out.println(file+":"+file.delete());
			}
		}
	}

}

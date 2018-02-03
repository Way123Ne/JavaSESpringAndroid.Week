package com.wayne.io.c1.file.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("e:\\1\\what");
		
		listAll(dir,0);
	}

	public static void listAll(File dir,int level) {
		System.out.println(getSpace(level)+dir.getAbsolutePath());
		
		//获取指定目录下当前所有文件夹或文件对象
		level++;
		File[] files = dir.listFiles();
		
		for(int x = 0; x<files.length; x++){
			
			if(files[x].isDirectory()){
				listAll(files[x],level);
			}
			else
			System.out.println(getSpace(level)+files[x].getAbsolutePath());
		}
	}

	public static String getSpace(int level) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int x=0;x<level;x++){
			sb.append("   ");
		}
		return sb.toString();
	}

}

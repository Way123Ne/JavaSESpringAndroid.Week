package com.wayne.inter;

public class UpperLetter implements ChangeLetter {

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String str;
	
	@Override
	public String change() {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

}

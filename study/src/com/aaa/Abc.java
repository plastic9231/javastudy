package com.aaa;

class Cccc {
	
	private int c = 30;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}

public class Abc {

	public int a;
	Cccc cc = new Cccc();
	
	public static void main(String[] args) {
		
		Cccc cc = new Cccc(); //객체 생성
		
		System.out.println(cc.getC());
		
		cc.setC(60);
		System.out.println(cc.getC());
	}
	
}
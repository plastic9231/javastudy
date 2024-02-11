package ConstPrac;

public class NumberTest4 {
	
	int n, m;
	
	public NumberTest4() {
		n = 200;
		m = 300;
		System.out.println("매개변수가 업슨 생성자...");
	}
	
	//초기화 블록
	{
		n = 100;
		m = 200;
		System.out.println("초기화");
	}
	
	public NumberTest4(int n, int m) {
		this.n = n;
		this.m = m;
		System.out.println("매개변수가 있는 생성자...");
	}
	
	void print() {
		System.out.println("n : "+n+", m : "+m);		
	}
}

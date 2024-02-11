package ConstPrac;

public class NumberTest3 {

	int val1;
	double val2;
	
	public NumberTest3() {
		val1 = 0;
		val2 = 0;
		System.out.println("매개변수가 없는 생성자...");	
	}
	
	public NumberTest3(int x) {
		this.val1 = x;
		this.val2 = 0;
		System.out.println("int형 매개변수를 받는 생성자..");
	}
	
	public NumberTest3(double y) {
		this.val1 = 0;
		this.val2 = y;
		System.out.println("double형 매개변수를 받는 생성자.");
	}
	
	public NumberTest3(int x, double y) {
		this.val1 = x;
		this.val2 = y;
		System.out.println("int형과 double형 매개변수를 받는 생성자");
	}
}

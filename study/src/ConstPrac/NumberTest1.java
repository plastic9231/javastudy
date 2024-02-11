package ConstPrac;

public class NumberTest1 {
	
	int num;
	
	public NumberTest1(int n) {
		
		this.num = n;
		System.out.println("인자전달 : "+n);		
	}

	public int getNumber() {
		return num+1;
	}

}

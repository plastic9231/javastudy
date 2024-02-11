package ObjectPrac01;

/*
 * public		: 모든 접근을 허용
 * protected	: 같은 패키지에 있는 객체와 상속관계의 객체들만 허용
 * default		: 같은 패키지에 있는 객체만 접근을 허용
 * private		: 현재 객체내에서만 접근을 허용
 */

import com.aaa.*;

class Salary {
	
	private int pay;	//필드
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay, String pass) {	//메소드
		
		if(pass.equals("1234")) {
			this.pay = pay;
		};
		
	}
}

public class SalaryEx {

	public static void main(String[] args) {
		
		Salary sal = new Salary();
		
		//sal.pay = 10000;
		sal.setPay(10000, "1234");
		
		int mypay = sal.getPay();
		System.out.printf("나의 금액은 %d원", mypay);
		
		Abc abc = new Abc();
		abc.a = 10;

	}

}

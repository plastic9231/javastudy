package InheritancePrac;

import java.io.*;

public class BClass extends AClass {

	//데이터 입력하는 메소드
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("두개의 정수 입력(공백 구분) : ");
		String temp = br.readLine();
		String[] str = temp.split("\\s");
		
		if(str.length!=2) {
			return false;
		};
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		
		System.out.print("연산자 입력 : ");
		op = (char)System.in.read();
		
		if(op=='+'||op=='-'||op=='*'||op=='/') {
			return true;
		};
		
		return false;
	}
	
	//계산하는 메소드
	double calc() {
		double result = 0;
		
		switch(op) {
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;
		case '/' : result = x/y; break;
		default : 		
		}
		return result;
	}
	
}

package SwitchPrac;

import java.io.*;
import java.util.*;

public class SwicthExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		int num1, num2, sum = 0;
		char op = 0;
		
		System.out.print("첫번째 정수 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자 : ");
		op = (char)System.in.read();
		System.in.skip(2);
		//op = sc.next().charAt(0);
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(br.readLine());
		
		switch(op) {
		case '+': System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2)); break;
		case '-': System.out.printf("%d %c %d = %d", num1, op, num2, (num1-num2)); break;
		case '*': System.out.printf("%d %c %d = %d", num1, op, num2, (num1*num2)); break;
		case '/': System.out.printf("%d %c %d = %d", num1, op, num2, (num1/num2)); break;
		case '%': System.out.printf("%d %c %d = %d", num1, op, num2, (num1%num2)); break;
		default: System.out.println("나 안해"); return;	//return : 메소드의 종료, 값을 반환하고 종료하는 의미를 가짐
		};

	}

}

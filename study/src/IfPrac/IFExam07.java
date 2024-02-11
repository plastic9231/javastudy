package IfPrac;

import java.io.*;
import java.util.*;

public class IFExam07 {

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
		
		if(op=='+') {
			System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2));
		}else if(op=='-') {
			System.out.printf("%d %c %d = %d", num1, op, num2, (num1-num2));
		}else if(op=='*') {
			System.out.printf("%d %c %d = %d", num1, op, num2, (num1*num2));
		}else if(op=='/' ) {
			System.out.printf("%d %c %d = %d", num1, op, num2, (num1/num2));
		}else if(op=='%' ) {
			System.out.printf("%d %c %d = %d", num1, op, num2, (num1%num2));
		}else {
			System.out.println("나 안해");
		}
		
	}

}

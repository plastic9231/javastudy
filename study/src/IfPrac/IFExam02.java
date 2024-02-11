package IfPrac;

import java.util.*;

public class IFExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("임의의 정수 : ");
		n = sc.nextInt();	//입력받은 문자열을 정수로 변환
		
		if(n==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}else if(n!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		};
		
		System.out.printf("입력한 숫자 : %d", n);
		
	}

}

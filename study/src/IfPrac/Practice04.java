package IfPrac;

import java.util.*;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if(num1>num2&&num2>num3) {
			System.out.printf("%d, %d, %d중 %d가 중간값입니다.", num1, num2, num3, num2);
		}else if(num2>num3&&num3>num1) {
			System.out.printf("%d, %d, %d중 %d가 중간값입니다.", num1, num2, num3, num3);
		}else if(num3>num1&&num1>num2) {
			System.out.printf("%d, %d, %d중 %d가 중간값입니다.", num1, num2, num3, num1);
		}else {
			System.out.printf("꺼져");
		}

	}

}

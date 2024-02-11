package IfPrac;

import java.util.*;

public class Practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심좌표와 반지름길이를 입력하세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double radius = sc.nextDouble();
		
		double aa = Math.sqrt(a);
		double bb = Math.sqrt(b);
		
		System.out.print("두번째 원의 중심좌표와 반지름길이를 입력하세요 : ");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
		
		double a2a = Math.sqrt(a2);
		double b2b = Math.sqrt(b2);
		
		if(radius<=(a2a+b2b)&&radius2<=(aa+bb)) {
			System.out.println("두 원은 겹쳐용.");
		}else {
			System.out.println("안겹쳐.");
		};
		
	}

}

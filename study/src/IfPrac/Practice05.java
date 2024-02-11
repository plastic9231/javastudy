package IfPrac;

import java.util.*;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 변의 길이를 입력하세요 : ");
		int side1 = sc.nextInt();
		
		System.out.print("두번째 변의 길이를 입력하세요 : ");
		int side2 = sc.nextInt();
		
		System.out.print("세번째 변의 길이를 입력하세요 : ");
		int side3 = sc.nextInt();
		
		if(side1>side2&&side1>side3) {
			if(((side2*side2)+(side3*side3))==(side1*side1)) {
				System.out.printf("%d, %d, %d 3개의 숫자로 삼각형 형성이 가능합니다,", side1, side2, side3);
			}
		}else if(side2>side3&&side2>side1) {
			if(((side3*side3)+(side1*side1))==(side2*side2)) {
				System.out.printf("%d, %d, %d 3개의 숫자로 삼각형 형성이 가능합니다,", side1, side2, side3);
			}
		}else if(side3>side1&&side3>side2) {
			if(((side1*side1)+(side2*side2))==(side3*side3)) {
				System.out.printf("%d, %d, %d 3개의 숫자로 삼각형 형성이 가능합니다,", side1, side2, side3);
			}
		}else {
			System.out.printf("꺼져");
		};

	}

}

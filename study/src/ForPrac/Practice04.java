package ForPrac;

import java.util.*;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//일곱번째 문제
		System.out.print("숫자를 입력하세요 : ");
		int mult = sc.nextInt();
		int rep = 1;
		
		for(int i=1; i<=9; i++) {
			if(mult>9||mult==0||mult<0) {
				System.out.print("꺼져");
				break;
			}
			rep = mult*i;
			System.out.printf("%d x %d = %d%n", mult, i, rep);
			
		}
		
		//여덟번째 문제
		/*
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int count = 3*i;
			System.out.printf("%d ", count);
		};
		*/

	}

}

package ForPrac;

import java.util.*;

public class Practice01 {

	public static void main(String[] args) {
		/*첫번째 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum += i;
		};
		
		System.out.printf("0부터 %d사이의 합 : %d", num, sum);
		*/
		
		//두번째 문제
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int count = 0;
		int sum = 0;
		float avg = 0;
		
		/*System.out.print("몇개의 정수를 더할까요? : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("점수를 입력하세요 : ");
			a = sc.nextInt();
			if(a>=0) {
				sum += a;
				count++;
			}else {
				break;
			}
			avg = sum/count;
		};*/
		
		/*for(;a>=0;) {
			System.out.print("점수를 입력하세요 : ");
			a = sc.nextInt();
			if(a>=0) {
				sum += a;
				count++;
			}else {
				break;
			}
			avg = sum/count;
		};*/
		
		for(; a>=0;) {
			sum += a;
			avg = (float)sum/count;
			System.out.print("점수를 입력하세요 : ");
			a = sc.nextInt();
			count++;
		};
		
		System.out.printf("합계는 %d, 평균은 %.1f입니다,", sum, avg);
		
	}

}

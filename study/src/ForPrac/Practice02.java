package ForPrac;

import java.util.*;

public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*세번째 문제
		int a = 0;
		int b = 0;
		int sum = 0;
		
		for(;;) {
			System.out.print("두개의 정수를 입력하세요 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			if(a!=0&&b!=0) {
				sum = a+b;
				System.out.printf("%d+%d=%d %n%n", a, b, sum);
			}else {
				System.out.printf("%n꺼져");
				break;
			}
		};*/
		
		//네번째 문제
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			if(i<10) {
				System.out.printf("%d+", i);
			}else if(i==10) {
				System.out.printf("%d", i);
			};
		};
		System.out.printf("=%d", sum);

	}

}

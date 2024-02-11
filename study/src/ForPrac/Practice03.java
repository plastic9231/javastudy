package ForPrac;

import java.util.*;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//다섯번째 문제
		/*System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		int n = 1;
		
		System.out.printf("%d! =  ", a);
		for(int i=a; i>=1; i--) {
			n = n*i;
			if(a>=i&&i!=1) {
				System.out.printf("%d * ", i);
			}else if(i==1) {
				System.out.printf("%d", i);
			};
		};
		System.out.printf(" = %d", n);*/
		
		
		//여섯번째 문제
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i;
		int sum = 0;
		int even = 0;
		int odd = 0;
		
		for(i=1; i<=num; i++) {
			sum += i;
			
			if(i%2==0) {
				even += i;
			}else if(i%2!=0) {
				odd += i;
			};
			if(i==num) {
				System.out.printf("1~%d까지의 전체합 : %d%n", i, sum);
				System.out.printf("1~%d까지의 짝수합 : %d%n", i, even);
				System.out.printf("1~%d까지의 홀수합 : %d%n%n", i, odd);
			}else if(i%10==0) {
				System.out.printf("1~%d까지의 전체합 : %d%n", i, sum);
				System.out.printf("1~%d까지의 짝수합 : %d%n", i, even);
				System.out.printf("1~%d까지의 홀수합 : %d%n%n", i, odd);
			};
			
		};

	}

}

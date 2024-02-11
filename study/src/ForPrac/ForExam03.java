package ForPrac;

import java.util.*;

public class ForExam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("원하는 배수를 입력하세요 : ");
		int bae = sc.nextInt();
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=Math.min(num,num2); i<=Math.max(num,num2); i++) {
			sum += i;
			
			if((i%bae)==0) {
				sum1 += i;
			};
		};
		System.out.printf("%d부터 %d사이의 합 : %d%n%n", num, num2, sum);
		System.out.printf("%d부터 %d사이에서 %d의 배수의 합 : %d", num, num2, bae, sum1);
		
	}

}

package ForPrac;

import java.util.*;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//아홉번째 문제
		/*System.out.print("숫자(양의 정수)의 갯수를 입력하세요 : ");
		int nums = sc.nextInt();
		
		int sum = 0;
		float avg;
		
		for(int i=1; i<=nums; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			sum += num;
		}
		avg = (float)sum/nums;
		
		System.out.printf("입력한 숫자의 평균 : %.2f ", avg);*/
		
		//열번째 문제
		System.out.print("3의 승수를 입력하세요 : ");
		int num = sc.nextInt();
		int mult = 1;
		
		for(int i=1; i<=num; i++) {
			mult *= 3;
		}
		
		System.out.printf("3의 %d승은 = %d", num, mult);
		
	}

}

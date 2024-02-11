package WhilePrac;

import java.util.*;

public class WhileExam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int i = 1;
		float sum = 0;
		float div = 0;
		
		while(i<=9) {
			div = (float)i/(i+1);
			sum += div;	
			i++;
			
		};
		System.out.printf("연산결과 = %.2f ", sum);
		
	}

}

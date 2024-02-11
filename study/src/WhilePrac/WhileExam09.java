package WhilePrac;

import java.util.*;

public class WhileExam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int mult = 1;
		int sum = 0;
		
		while(i<=100) {
			if(i%2==0) {
				mult = i*i;
			}else if(i%2!=0) {
				mult = (i*(-1))*i;
			}
			sum += mult;
			i++;
		};
		System.out.printf("연산결과 = %d", sum);
		

	}

}

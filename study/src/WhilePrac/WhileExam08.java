package WhilePrac;

import java.util.*;

public class WhileExam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int mult = 1;
		
		while(i<=10) {
			mult *= i;
			i++;
		};
		System.out.printf("연산결과 = %d ", mult);

	}

}

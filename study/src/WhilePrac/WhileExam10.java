package WhilePrac;

import java.util.*;

public class WhileExam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = -50;
		int count = 1;
		
		while(i<=1) {
			System.out.printf("%d\t", i);
			if(count%5==0) {
				System.out.printf("%n");
			};
			count++;
			i++;
		};

	}

}

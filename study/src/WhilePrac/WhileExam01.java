package WhilePrac;

import java.util.*;

public class WhileExam01 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		/*
		while(i<5) {
			System.out.println("*");
			i++;
		}
		*/
		
		/*
		while(true) {
			System.out.print("숫자 입력 : ");
			i = sc.nextInt();
			
			if(i%2!=0) {
				break;
			}
			
			
		}
		System.out.println("프로그램을 종료하겠습니다.");
		*/
		
		while(true) {
			System.out.println("사랑하나요? (y/n)");
			String yn = sc.next();
			
			if(yn.equals("y")||yn.equals("Y")) {
				System.out.println("사랑해요\n");
			}else if(yn.equals("n")||yn.equals("N")) {
				System.out.println("사랑하지 않아요");
				break;
			}
			
		}
	}

}

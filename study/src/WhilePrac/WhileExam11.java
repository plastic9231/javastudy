package WhilePrac;

import java.util.*;

public class WhileExam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] japangi = {"콜라", "사이다", "마운틴", "초코송이", "에이스", "웨하스"};
		
		while(true) {
			System.out.print("1.콜라 2.사이다 3.마운틴 4.초코송이 5.에이스 6.웨하스 : ");
			int n = sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.printf("%s를 고르셨어요.%n", japangi[0]);
				break;
			case 2:
				System.out.printf("%s를 고르셨어요.%n", japangi[1]);
				break;
			case 3:
				System.out.printf("%s를 고르셨어요.%n", japangi[2]);
				break;
			case 4:
				System.out.printf("%s를 고르셨어요.%n", japangi[3]);
				break;
			case 5:
				System.out.printf("%s를 고르셨어요.%n", japangi[4]);
				break;
			case 6:
				System.out.printf("%s를 고르셨어요.%n", japangi[5]);
				break;
			case 0:
				System.out.print("프로그램을 종료합니다.");
				return;
			default :
				System.out.print("선택하신 상품이 없습니다. 다시 선택해주세요.\n");
				break;
			};
		}

	}

}

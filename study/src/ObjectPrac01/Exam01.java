package ObjectPrac01;
import java.util.*;

public class Exam01 {
	
	Scanner sc = new Scanner(System.in);
	
int num1() {
	System.out.println("2개의 정수 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = 0;
		if(a>b) {
			c = a;
		}
		else {
			c = b;
		}

		
		return c;
	}

int num2() {
	System.out.println("2개의 정수 입력: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = 0;
	if(a>b) {
		 a = a^b;
		 b = b^a;
		 a = a^b;
	}
	for(int i = a;i<b;i++) {
		sum = sum+i;
	}
	return sum;
}

String num3(int a,int b, int c) {
	
	
	if(a<b) {
		 a = a^b;
		 b = b^a;
		 a = a^b;
		 if(b<c) {
			b = b^c;
		 	c = c^b;
		 	b = b^c;
		 	if(a<b) {
		 		a = a^b;
				b = b^a;
				a = a^b;
		 	}
		 }
	}else {
		if(b<c) {
			b = b^c;
		 	c = c^b;
		 	b = b^c;
		}
		 	if(a<b) {
		 		a = a^b;
				b = b^a;
				a = a^b;
		 	}
	}
	String d = a+">="+b+">="+c;

	return d;
	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exam01 num1 = new Exam01();
		Exam01 num2 = new Exam01();
		Exam01 num3 = new Exam01();
		int x = 0;
		
		while(true) {
			System.out.println("1. 최댓값 2. 사이의 합계 3. 큰 수 나열 4 . 종료 =>");
			x = sc.nextInt();
			
			if(x == 4) {
				break;
			}else if(x == 1) {
				System.out.println(num1.num1());
			}else if(x == 2) {
				System.out.println(num2.num2());
			}else if(x == 3) {
				System.out.println("3개의 정수 입력: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				System.out.println(num3.num3(a,b,c));
			}
			else {
				System.out.println("선택하신 번호는 메뉴에 존재하지 않습니다.");
			}
		}

	}

}

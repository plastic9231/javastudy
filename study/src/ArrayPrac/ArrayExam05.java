package ArrayPrac;

import java.util.*;

public class ArrayExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력해주세요 : ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		String[] tel = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d번 학생의 이름과 전화번호를 입력해주세요 : ", i+1);
			name[i] = sc.next();
			tel[i] = sc.next();
		};
		
		System.out.printf("%n전체 학생수 : %d명%n", n);
		System.out.printf("이름\t전화번호%n");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%s\t%s%n", name[i], tel[i]);
		};

	}

}

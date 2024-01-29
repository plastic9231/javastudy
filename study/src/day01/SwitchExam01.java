package day01;

import java.util.Scanner;

/*
 * Switch 형식
 * switch(조건) {
 * 	case 1 : 수행문장; break;
 * 	case 2 : 수행문장; break;
 * 	case 3 : 수행문장; break;
 * 	default : 
 * }
 */
public class SwitchExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sci, sic;
		int sum = 0;
		double avg = 0;
		String grade = "";
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		System.out.print("사회 점수 : ");
		sci = sc.nextInt();
		System.out.print("과학 점수 : ");
		sic = sc.nextInt();
		
		sum = kor+eng+math+sci+sic;
		avg = sum/5;
		
		System.out.printf("점수 합계 : %d, 평균 점수 : %.2f %n", sum, avg);
		
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade = "A";	break;
		case 8:
			grade = "B";	break;
		case 7:
			grade = "C";	break;
		case 6:
			grade = "D";	break;
		default:
			grade = "F";
		};
		
		System.out.printf("당신의 학점은 %s입니다.", grade);

	}

}

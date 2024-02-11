package IfPrac;

import java.util.*;

public class IFExam06 {

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
		
		if(avg>=90) {
			if(avg>=95) {
				grade = "A+";
			}else if(avg<95) {
				grade = "A-";
			}
		}else if(avg>=80&&avg<90) {
			grade = "B";
		}else if(avg>=70&&avg<80) {
			grade = "C";
		}else if(avg>=60&&avg<70) {
			grade = "D";
		}else {
			grade = "F";
		};
		
		System.out.printf("당신의 학점은 %s입니다.", grade);

	}

}

package ArrayPrac;

import java.io.*;

public class ArrayExam13 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sub = new int[4];
		float avg = 0.0f;
		
		do {
			System.out.print("국어점수 : ");
			sub[0] = Integer.parseInt(br.readLine());
		}while(sub[0]<0||sub[0]>100);
		
		do {
			System.out.print("영어점수 : ");
			sub[1] = Integer.parseInt(br.readLine());
		}while(sub[1]<0||sub[1]>100);
		
		do {
			System.out.print("수학점수 : ");
			sub[2] = Integer.parseInt(br.readLine());
		}while(sub[2]<0||sub[2]>100);
		
		sub[3] = sub[0]+sub[1]+sub[2];
		avg = sub[3]/3.0f;
		
		System.out.printf("%n총점 : %d%n평균 : %.2f", sub[3], avg);

	}

}

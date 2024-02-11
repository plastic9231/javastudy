package ArrayPrac;

import java.io.*;

public class ArrayExam12 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum = 0;
		float avg = 0.0f;
		
		do {
			System.out.print("국어점수 : ");
			kor = Integer.parseInt(br.readLine());
		}while(kor<0||kor>100);
		
		do {
			System.out.print("영어점수 : ");
			eng = Integer.parseInt(br.readLine());
		}while(eng<0||eng>100);
		
		do {
			System.out.print("수학점수 : ");
			mat = Integer.parseInt(br.readLine());
		}while(mat<0||mat>100);
		
		sum = kor+eng+mat;
		avg = sum/3.0f;
		
		System.out.printf("%n총점 : %d%n평균 : %.2f", sum, avg);
	}

}

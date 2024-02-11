package ArrayPrac;

import java.io.*;

public class ArrayExam14 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"};
		
		// 이차원 배열 선언
		int[][] sub = new int[3][subname.length+2]; // 5
		
	
		// System.out.println(sub.length);
		// 0: 국어, 1: 영어, 2: 수학, 3: 총점, 4: 석차
		float[] avg = new float[3];
		
		for(int k = 0; k < sub.length; k++) { // 행 : 사람수
			for(int i = 0; i < sub[k].length-2; i++) {
				do {
					System.out.print(subname[i] + " 점수 : ");
					sub[k][i] = Integer.parseInt(br.readLine());
					}while(sub[k][i] < 0 || sub[k][i] > 100);
				// 총점
				sub[k][sub[k].length-2] += sub[k][i];
			}
			
			// 평균
			avg[k] = sub[k][sub[k].length-2] / (float)(sub[k].length-2);
			// 총점을 가지고 석차를 구함
			sub[k][sub[k].length-1] = 1;
			// 띄어쓰기
			System.out.println();
		}
		
		// 석차
		for(int k = 0; k < sub.length; k++) {
			
			for(int i = 0; i <sub.length; i++) {
				if(sub[k][sub[k].length-2] < sub[i][sub[i].length-2]) {
					// 98 < 90
					sub[k][sub[k].length-1]++;
				}
			}
		}
		
		// 결과 출력
		for(int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println("석차 : " + sub[k][sub[k].length-1]+"등");
			System.out.println("총점 : " + sub[k][sub[k].length-2]);
			System.out.println("평균 : " + avg[k]);	
		}

	}

}

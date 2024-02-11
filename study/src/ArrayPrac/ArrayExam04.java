package ArrayPrac;

import java.util.*;

public class ArrayExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int max = 0;
		
		System.out.print("입력할 데이터 계수 : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("데이터 입력[공백 구분] : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		};
		
		System.out.print("데이터 출력 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		};
		System.out.printf("%n가장 큰 수 : %d ", max);

	}

}

package ArrayPrac;

import java.util.*;

public class ArrayExam16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.print("정수 10개 입력 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%3==0) {
				System.out.printf("arr[%d] = %d%n", i, arr[i]);
			};
		};

	}

}

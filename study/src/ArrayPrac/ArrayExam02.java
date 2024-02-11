package ArrayPrac;

import java.util.*;

public class ArrayExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {4,7,9,1,3,2,5,6,8};
		
		System.out.println(Arrays.toString(arr));	//배열값 출력하는 첫번째 방법
		
		for(int t : arr) {							//배열값 출력하는 두번째 방법
			System.out.print(t);
		};
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			//System.out.printf("arr[%d]에 저장된 값 : %d%n", i, arr[i]);
			
			if(arr[i]%2==0) {
				System.out.printf("arr[%d]에 저장된 짝수값 : %d%n", i, arr[i]);
			};
		}
		
		for(int i=0; i<arr.length; i++) {

			if(arr[i]%3==0) {
				System.out.printf("arr[%d]에 저장된 3의 배수값 : %d%n", i, arr[i]);
			};
		}
		
	}

}

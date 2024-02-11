package ArrayPrac;

import java.util.*;

public class ArrayExam10 {

	public static void main(String[] args) {
		
		//3차원 배열
		/*
		int arr[][][] = new int[2][3][4];	//면, 행, 열
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length+1; j++) {
				for(int z=0; z<arr.length+2; z++) {
					arr[i][j][z] = n;
					System.out.printf("arr[%d][%d][%d] = %d\t", i, j, z, arr[i][j][z]);
					n++;
				};
				System.out.println();	//행구분
			};
			System.out.println();		//면구분
		};
		*/
		
		//비정형 배열
		/*
		int arr2[][] = {
			{10, 11, 12},
			{20, 21},
			{30, 31, 32, 33},
			{40, 41, 42}
		};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\t", i, j, arr2[i][j]);
			};
			System.out.println();
		};
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int arr3[][] = new int[4][];
		int i, j, n;
		
		for(i=0; i<arr3.length; i++) {
			n=0;
			System.out.print("열의 개수를 입력하세요 : ");
			n = sc.nextInt();
			arr3[i] = new int[n];
			for(j=0; j<arr3[i].length; j++) {
				arr3[i][j] = sc.nextInt();
			};
		};
		
	}

}

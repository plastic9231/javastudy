package DoubleForPrac;

import java.util.*;

public class DoubleForExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		int m = 1;
		
		while(true) {
			for (int i=1; i<=n; i++) {
				for (int j=n; j>i; j--) {
					System.out.print(" ");
				}
				for (int j=1; j<=((i*2)-1); j++) {
					System.out.print("*");
				}
				System.out.println();
			};
			
			for (int i=(n-1); i>0; i--) {
				for (int j=n; j>i; j--) {
					System.out.print(" ");
				}
				for (int j=1; j<=((i*2)-1); j++) {
					System.out.print("*");
				}
				System.out.println();
			};
			m++;
			if(m>n) {
				break;
			}
		};
		*/
		
	    int a = 1;
	    int b = 9;
	    int i=1;
	    int start = i/2 + 1;
	    
	    for(i=1;i<=9;i++){
	     for(int j=1;j<=9;j++){
	       if(a==j || b==j){
	        System.out.print("*");
	       }else{
	        System.out.print(" ");
	       }
	     }
	     a++;
	     b--;
	     System.out.println();
	    }
		
		/*
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			};
			System.out.println();
		};
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			};
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			};
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			};
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			};
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			};
			System.out.println();
		}
		*/

	}

}

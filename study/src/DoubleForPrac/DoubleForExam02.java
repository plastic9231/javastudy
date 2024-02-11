package DoubleForPrac;


public class DoubleForExam02 {
	
	public static void main(String[] args) {
		
		/*
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
			System.out.println("");
		};
		*/
		
		/*
		int i=1;	
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			};
			i++;
			System.out.println();
		};
		*/
		
		/*
		int i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
				j++;
			}
			i++;
			System.out.println("");
		};
		*/
		
		/*
		int i=2;
		do {
			int j=1;
			do {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
				j++;
			}while(j<=9);
			i++;
			System.out.println("");
		}while(i<=9);
		*/
		
		/*
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			};
			System.out.println();
		};
		System.out.println("---------------");
		
		int i=1;
		while(i<=5) {
			int j=5;
			while(j>=i) {
				System.out.print("*");
				j--;
			};
			i++;
			System.out.println();
		};
		System.out.println("---------------");
		
		int i1=1;
		do {
			int j=5;
			do {
				System.out.print("*");
				j--;
			}while(j>=i1);
			i1++;
			System.out.println();
		}while(i1<=5);
		System.out.println("---------------");
		*/
		


		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.printf("%d x %d = %d\t",j, i, (j*i));
			};
		
			System.out.println();
		};
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %d\t",j, i, (j*i));
			};
		
			System.out.println();
		};
		
	}

}

package ObjectPrac02;

import java.util.*;

public class Circle {
	
	int r;
	final double pi = 3.141592;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력 : ");
		r = sc.nextInt();
	}
	
	double area() {
		double result = r*r*pi;
		return result;
	}
	
	double length() {
		double result = 2*pi*r;
		return result;
	}
	
	void print(double a, double b) {
		System.out.printf("원의 반지름 : %d%n", r);
		System.out.printf("원의 넓이 : %.2f%n", a);
		System.out.printf("원의 둘레 : %.2f%n", b);
	}
	
	

}

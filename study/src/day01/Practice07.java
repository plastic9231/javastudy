package day01;

import java.util.*;

public class Practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심좌표를 입력하세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.print("반지름의 길이를 입력하세요 : ");
		double radius = sc.nextDouble();
		
		System.out.print("x좌표를 입력하세요 : ");
		double x = sc.nextDouble();
		
		System.out.print("y좌표를 입력하세요 : ");
		double y = sc.nextDouble();
		
		double z = ((x-a)*(x-a))+((y-b)*(y-b));
		
		if(z<=(radius*radius)) {
			System.out.printf("좌표(%.1f,%.1f)는 원 안에 있음", x, y);
		}else if(z>(radius*radius)) {
			System.out.printf("좌표(%.1f,%.1f)는 원 밖에 있음", x, y);
		}
		
		

	}

}

package Exam;

import java.util.*;

class Circle {
	private double x, y;	
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x; 
		this.y = y; 
		this.radius = radius;
	}
	
	public void show() {
		System.out.printf("(%.1f, %.1f)%d ", x, y, radius);
	}
}

public class PracticeExMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius : ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();	 
			int radius = sc.nextInt();
			
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}

	}

}

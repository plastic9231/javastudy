package Exam;

import java.util.*;

class Circle2 {
	private double x, y;	
	private int radius;
	
	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {		
		System.out.printf("(%.1f, %.1f)%d ", x, y, radius);
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

public class PracticeExMain06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle2 c[] = new Circle2[3];
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius : ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();	 
			int radius = sc.nextInt();
			
			c[i] = new Circle2(x,y,radius);
		};
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		};
		
		int bigIndex = 0;
		
		for(int i=0; i<c.length; i++) {
			if(c[bigIndex].getArea()<c[i].getArea()) {
				bigIndex = i;
			};
		};
		
		System.out.print("가장 면적이 큰 원은? : ");
		c[bigIndex].show();

	}

}

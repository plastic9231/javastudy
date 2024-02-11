package Exam;

public class Rectangle {

	private int x, y, width, height;

	public Rectangle() {
		x = 1;
		y = 1;
		width = 1;
		height = 1;
	}

	public Rectangle(int x, int y, int width, int height) {
		if(x<=0||y<=0) {
			System.out.println("야 꺼져");
			System.exit(0);
		}
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width*height;
	}
	
	void show() {
		System.out.printf("사각형의 좌표는 (%d,%d)이고 넓이는 %d입니다.%n", x, y, square());
	}
	
	public boolean contains(Rectangle r) {
		if(x<=r.x&&r.x<x+width&&
			y<=r.y&&r.y<y+height) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

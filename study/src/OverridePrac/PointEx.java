package OverridePrac;

public class PointEx {		//부모 클래스
	
	private int x, y;
	
	public PointEx() {
		
	}
	public PointEx(int x) {
		
	}
	public PointEx(int x, int y) {
	
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

}

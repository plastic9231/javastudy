package OverridePrac;

public class CircleEx extends PointEx {
	
	private int r;
	
	public CircleEx() {
		
	}
	public CircleEx(int x) {
		super(x);
		r = 1;
	}
	public CircleEx(int x, int y) {
		super(x,y);
		r = 2;
	}
	public CircleEx(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	public void disp() {
		super.disp();
		System.out.println("r : "+r);
	}

}

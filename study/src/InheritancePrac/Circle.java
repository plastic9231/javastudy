package InheritancePrac;

public class Circle extends Shape {
	
	public Circle(String title) {
		super(title);
	}
	
	public void calc(int r) {
		area = r*r*3.141592;
		write();
	}

}

package InheritancePrac;

public class AClass {
	
	protected int x, y;
	protected char op;
	
	public AClass() {
		
	}
	
	public void write(double result) {
		System.out.printf("%d %c %d = %.2f%n", x, op, y, result);
	}

}

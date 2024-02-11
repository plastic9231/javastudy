package ClassMethodPrac;

public class OverloadingExam {

	public static void main(String[] args) {
		
		OverloadingEx oe = new OverloadingEx();
		
		oe.getLength(1000);
		oe.getLength(3.14f);
		oe.getLength("10000");

	}

}

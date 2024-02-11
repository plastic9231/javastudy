package Exam;

public class Operator {
	
	static class Add {
		private int a, b;
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
			return a+b;
		}
	}
	
	static class Sub {
		private int a, b;
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
			return a-b;
		}
	}
	
	static class Mult {
		private int a, b;
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
			return a*b;
		}
	}
	
	static class Div {
		private int a, b;
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
			try {
				return a/b;
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			};
			return a/b;
		}
	}

}

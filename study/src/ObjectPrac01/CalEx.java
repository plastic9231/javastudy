package ObjectPrac01;

public class CalEx {

	public static void main(String[] args) {
		
		//객체 생성
		Add add = new Add();
		Sub sub = new Sub();
		
		//Add 클래스 속성에 값을 대입
		add.a = 5;
		add.b = 5;
		
		sub.a = 5;
		sub.b = 5;
		
		int a = add.add();
		int b = add.sub();
		int c = sub.mul();
		int d = sub.div();
		
		System.out.printf("더한 결곽 : %d%n", a);
		System.out.printf("뺀 결과 : %d%n", b);
		System.out.printf("곱한 결곽 : %d%n", c);
		System.out.printf("나눈 결과 : %d%n", d);
		
	}

}

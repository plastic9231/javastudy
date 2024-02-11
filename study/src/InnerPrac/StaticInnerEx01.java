package InnerPrac;

/*
 * static 이너 클래스, 정적 중첩 클래스
 * - static 이너 클래스로 어쩔 수 없이 정의하는 경우가 종종 발생되는데, 그것은 이너 클래스안에 static변수를 가지고 있다면 어쩔 수 없이
 * static으로 선언해야 한다.
 * - 이너 클래스의 지정어로 static을 기재하면 static 변수를 사용할 수 있다.
 */

public class StaticInnerEx01 {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static class Inner {
		//어쩔수 없이 내부클래스를 static선언해야 할 경우, 내부클래스의 멤버 중 하나라도 static멤버가 있을 경우에 선언한다.
		
		static int d = 1000;
		
		void printData() {
			//System.out.println("a : "+a);
			//System.out.println("b : "+b);
			System.out.println("c : "+c);
			//System.out.println("d : "+d);
		}
	}

	public static void main(String[] args) {
		
		StaticInnerEx01.Inner si = new StaticInnerEx01.Inner();
		si.printData();

	}

}

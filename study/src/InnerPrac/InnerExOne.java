package InnerPrac;

/*
 * 멤버클래스 또는 인스턴스클래스
 * - 외부클래스의 멤버변수 선언위치에 선언하며, 외부클래스의 인스턴스 멤버처럼 다뤄진다.
 * - 외부클래스의 인스턴스멤버들과 관련된 작업에 사용될 목적으로 선언된다.
 * 
 * - 객체를 생성해야만 사용할 수 있는 멤버들과 같은위치에 정의되는 클래스
 * - 클래스의 객체를 생성하려면 외부크래스의 객체를 먼저 생성한 후에 객체를 생성할 수 있다.
 * 
 * - 내부클래스 내부에는 static이 존재하지 않는다.
 */

class OuterEx {		//외부클래스
	
	class InnerEx {	//내부클래스
		int x = 5;
	}
}

public class InnerExOne {

	public static void main(String[] args) {
		
		//내부 객체의 멤버에 접근하려면 외부객체를 먼저 생성
		OuterEx eo = new OuterEx();
		
		//외부객체를 통해서 내부객체를 생성
		OuterEx.InnerEx ei = eo.new InnerEx();
		
		//외부,내부객체를 한번에 생성하는 방법도 있음
		OuterEx.InnerEx ei2 = new OuterEx().new InnerEx();
		
		System.out.println(ei.x);

	}

}

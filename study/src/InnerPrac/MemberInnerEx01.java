package InnerPrac;

class Outer {
	private int x = 100;
	
	public void aaa() {
		System.out.println(x);
		
		Inner i = new Inner();
		System.out.println(i.y);	//컴파일 에러 : 외부클래스에서 내부클래스의 멤버에는 접근할 수 없다.
	}
	
	class Inner {
		private int y = 200;
	}
}

public class MemberInnerEx01 {

	public static void main(String[] args) {
		
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		
		//System.out.println(ou.x);
		//System.out.println(in.y);
		
		ou.aaa();

	}

}

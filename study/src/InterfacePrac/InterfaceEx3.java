package InterfacePrac;

/*
 * 인터페이스는 상수와 추상메소드만 가질 수 있으며, 인터페이스 내의 메소드는 접근제한자를 public으로 설정
 * 만약 생략되어 있으면 컴파일러가 자동으로 처리(public으로)
 * 클래스에서 구현되면 바로 접근될 수 있다.
 * 
 * 인터페이스의 특징
 * - 추상클래스의 일종으로 선언만 있고 정의가 없다.
 * - final변수는 가질 수 있다.(상수개념)
 * - 인터페이스는 (public static final)상수만 만들 수 있다.
 * - 하나 이상의 인터페이스를 구현할 수 있다.
 * - 인터페이스를 구현한 클래스는 인터페이스의 모든 메소드를 재정의 해야한다.
 * - 인터페이스는 다른 인터페이스를 상속받을 수 있으며, 이때의 키워드는 (extends)를 사용한다.
 * - 클래스와 달리 인터페이스는 다중상속을 허용한다.
 */

interface Demo {
	public static final double PI = 3.1415925;
	
	//static final 생략하면 컴파일러가 자동으로 처리
	public int a = 10;
	
	//메도스는 선언만 가능
	//abstract 생략
	public void print();

}

//구현클래스
class DemoImpl implements Demo {
	public void write() {
		System.out.println("클래스에 정의된 메소드.");
	}

	@Override
	public void print() {
		System.out.println("인터페이스 메소드를 재정의한 것");
	}
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		
		Demo ob = new DemoImpl();	//업캐스팅
		
		ob.print();
		
		((DemoImpl)ob).write();		//다운캐스팅
		
		//변수에 접근 가능(static이기 때문)
		System.out.println(Demo.PI);
		System.out.println(Demo.a);

	}

}

package InterfacePrac;

/*
 * 인터페이스
 * - 두 객체가 서로 통신하는 규칙, 약속이고 추상메소드를 사용해 자식클래스가 그 메소드를 오버라이딩하여 사용하도록 만드는 일종의 약속을 정한 것
 * - 자바 인터페이스는 모든 메소드가 추상메소드이고, 모든 변수가 static상수이다.
 * - 인터페이스의 모든 변수는 static이고 final이다.
 * - 만약에 static이나 final을 생략해도 컴파일러가 자동으로 처리한다.
 * - 인터페이스가 가지고 있는 추상메소드는 상속받은 클래스에서 하나도 빠짐없이 모든 메소드가 오버라이딩되야 한다.
 */

public interface InterEx {
	
	static final int A = 100;
	/*abstract*/ int getA();	//abstract 생략가능

}

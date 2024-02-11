package InterfacePrac;

/*
 * 인터페이스 상속
 * - 인터페이스 내에는 상수 또는 추상메소드가 정의되어 있다.
 * - 인터페이스를 구현할것이라 명시된 일반클래스에서 원하는 형태로 실제 구현력을 가지게 된다.
 * - 실제 구현력이 없는 인터페이스간의 상속에서는 다중상속을 허용한다.
 * 
 * - 인터페이스가 다른 인터페이스로부터 상소긍ㄹ 받았다고 하짐나 오버라이딩을 할 수는 없다.
 * - 상속을 받은 인터페이스를 구현하는 것은 일반 클래스에서 부모 인터페이스와 자식 인터페이스의 추상메소드를 모두 구현하면 됨(오버라이딩 하라는 뜻)
 * 
 * - 인터페이스는 과제를 생성할 수 없다.
 * - 객체를 생성하려면 상속한 하위클래스를 통해서 객체를 생성한다.
 */

public class InterfaceEx2 implements Inter3 {
	
	int a = 100;

	public static void main(String[] args) {
		
		InterfaceEx2 ie = new InterfaceEx2();
		
		//인터페이스의 다형성
		Inter1 it1 = ie;
		Inter2 it2 = ie;
		Inter3 it3 = ie;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getA());

	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}
	
	

}

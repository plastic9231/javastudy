package OverridePrac;

/*
 * 상속관계에서의 생성자 : super()
 * - 자식의 기본 생성시에는 super()가 생략되어 있다.
 * - 객체 생성시 무조건 부모의 객체를 생성함
 * - 부모의 생성자를 무조건 먼저 호출해야함
 */

public class Child extends Parent {
	//부모 클래스의 기본생성자가 없어서 안됨
	
	public Child() {		//자식 생성자
		super(5);		//부모의 생성자를 먼저 호출하기 때문
		System.out.println("하위 클래스의 생성자...");
	}

}

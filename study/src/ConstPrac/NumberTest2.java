package ConstPrac;

public class NumberTest2 {

	int x;
	
	//생성자는 일반 메소드들처럼 호출할 수 없다.
	//new 연산자를 이용하여 객체를 생성하기 위해 호출되며, 각 클래스의 인스턴스를 생성한 후 생성된 객체의 멤버를 초기화하는 작업을 수행
	
	//생성자 오버로딩
	public NumberTest2() {
		//생성자 내부에서 또 다른 생성자를 호출할 수 있다.
		//생성자 내부에서 다른 생성자를 호출할 경우 가장 먼저 호출해야함
		this(200);
		System.out.println("기본생성자~~~");		
	}

	public NumberTest2(int x) {
		System.out.println("인자가 하나 있는 생성자~~");
		this.x = x;
		//이와 같이 사용할 경우 x는 모든 지역에서 사용 가능한 변수다.
		System.out.println("x : "+x);
	}
}

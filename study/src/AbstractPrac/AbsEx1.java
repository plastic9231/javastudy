package AbstractPrac;

/*
 * 	추상클래스의 상속관계
 * 		- 추상클래스간에도 상속이 가능하다. 일반 클래스들간의 상속과 유사하지만
 * 		  추상클래스들간의 상속에서는 상속받은 추상메소드들을 꼭 재정의할 필요는
 * 		  없다. 그냥 상속만 해주고 필요할때 재정의해서 사용하면 된다.
 * 		  일반 클래스와 상속관계가 이루어질때 재정의 안한 메소드들을
 * 		  재정의 해서 사용하면됨
 */
public abstract class AbsEx1 {

	int a = 100; // 멤버필드
	final String str = "abstract test"; // 상수
	
	public String getStr() { // 일반 메소드
		return str;
	}
	
	// 추상메소드는 몸체가 없다.
	public abstract int getA();
	
	
	
}

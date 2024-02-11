package ClassMethodPrac;

/*
 * 인스턴스 멤버변수는 변수를 정의할때 초기화 하지 않으면 컴파일러가 자동으로 초기화(기본값으로)를 한다.
 * 
 * 자료형				기본값
 * ---------------------------
 * 정수형				0
 * 실수형				0.0
 * 문자형				'\u0000'
 * 논리형				false
 * 참조형				null
 * 
 * 클래스 변수의 종류
 * - 인스턴스변수 : 클래스영역에 정의된 변수. static이 앞에 오지 않는 변수. 인스턴스 변수는 객체가 생성될때 각 객체별로 초기화
 * - 스태틱변수 : 변수 앞에 static이 오는 변수. 초기화를 하지 않으면 컴파일러가 자동으로(기본값으로) 초기화
 * - 지역변수 : 메소드나 블록내에 정의되는 변수. 변수를 정의할때 초기화 하지 않으면 컴파일러가 오류를 발생(반드시 초기화작업을 해야함)
 */

public class VariableKind {
	
	//인스턴스변수 선언 : 초기화를 안하면 자동으로 기본값으로 초기화됨
	int memVer;		//전역변수
	
	//스태틱 변수
	static int staticVar;
	
	public static void main(String[] args) {
		
		VariableKind vk = new VariableKind();
		VariableKind vk1 = new VariableKind();
		
		//지역변수 선언 : 지역변수는 초기화하지 않으면 사용할 수 없음
		int localVar;
		
		System.out.println(vk.memVer);
		System.out.println(vk1.memVer);
		//System.out.println(localVar);	//초기화안해서 값을 출력못함
	}
	
}

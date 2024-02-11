package ConstPrac;

/*
 * 생성자의 역할
 * - 초기화
 * - 메모리할당
 * 
 * 생성자의 특징
 * - 생성자는 일반 메소드처럼 호출될 수 없다.
 * - 반환하는 자료형이 없다(void조차 가질 수 없음).
 * - 생성자는 클래스와 동일한 이름(대소문자구분)을 가져야 한다.
 * - 생성자는 객체를 생성하는 과정에서 new 생성자()의 형태로 호출된다.
 * - 생성자는 인스턴스 생성할때 단 한번만 호출된다.
 */

public class NumberTest {
	
	int num;	//인스턴스 변수
	
	public NumberTest() {		//기본생성자
		
		num = 10;
		System.out.println("생성자호출~~");
	}
	
	public int getNumber() {	//인스턴스 메소드
		return num;
	}
	

}

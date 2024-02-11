package ObjectPrac02;

/*
 * 사각형 클래스 설계
 * 
 * 사각형의 넓이와 둘레를 구하는 클래스를 구성
 * 클래스 : 사각형
 * 클래스의 속성 : 가로, 세로(둘레, 넓이, 무게, 색깔, 재질등)
 * 클래스의 기능 : 넓이계산, 둘레계산, 가로, 세로입력, 결과출력
 * 
 * 객체의 구성 : 데이터(속성, 상태)+기능(행위)
 * 클래스의 구성 : 변수(멤버필드)+메소드(함수)
 * 
 * void : 메소드 실행 후, 메소드를 호출한 곳에 결과를 반환할 필요가 없을 때 지정하는 반환형
 */

import java.util.*;

public class Rect {
	
	int w, h;	//전역변수라 모든 곳에서 사용가능
	
	void input() {	//사각형의 가로, 세로입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}
	
	int area() {		//넓이계산
		int result = w*h;		
		return result;
	}
	
	int length() {	//둘레계산
		int result = (w+h)*2;
		return result;
	}
	
	/*매개변수를 통해 데이터를 넘겨줌(갖고 있지 않은 데이터)
	 * 메소드의 매개변수 : 메소드 내에서 활동하는 변수
	 * 매개변수 선언시 각각의 변수마다 자료형을 따로 지정
	 */
	void print(int a, int b) {		//결과출력	
		System.out.printf("가로 : %d%n", w);
		System.out.printf("세로 : %d%n", h);
		
		System.out.printf("넓이 : %d%n", a);
		System.out.printf("둘레 : %d%n", b);
	}
	
 }

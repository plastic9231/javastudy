package ObjectPrac01;

/* 메소드
 * 
 * 1. 멤버함수(메소드): 객체가 할 수 있는 동작을 의미함
 * 	  instance 메소드와 static 메소드가 있다.
 * 
 * 2. 메소드 구성 요소
 * 	 [접근제한자] [반환형] [메소드명](자료형 인자1(매개변수),...) {// 인자는 여러개가 가능
 * 	 
 * 		메소드가 처리해아 하는 동작
 * 
 * 
 * 		}
 * [접근제한자]
 * 		자바에서 객체나 멤버들에 대한 접근을 제한하는 방법을 의미함
 * 		4가지 종류가 있다.
 * 	
 * 		private : 현재 클래스(객체) 내에서만 접근을 허용함
 *     	default : 같은 패키지에 있는 클래스(객체)만 접근을 허용함
 *      protected : 같은 패키지에 있는 객체와 상속관계의 객체들만 접근을 허용함      
 *      public : 모든 객체의 접근을 허용한다 
 * 
 * [반환형]
 * 		- 메소드에서 해야 할 일들을 마치고 마지막으로 메소드를 호출한 곳으로 값을
 * 		  돌려주는 자료형을 의미함
 *        만약, 반환되는 값이 없으면 void라는 키워드를 사용함
 *        반환형은 생략 불가
 *        
 * [메소드명]
 * 		사용자 정의 명
 * 
 *  인자값
 *  
 *  	Arguments라고 하며 이것은 메소드(멤버함수)를
 *  	호출할때 필요에 따라 특정한 값을 제공해주기 위해
 *  	미리 선언하는 것 이다.
 *  	메소드 호출시에는 반드시 인자의 자료형과 수가 일치해야한다.
 *  
 *  수행문
 *  	-식, 수행 및 제어문등을 실행한다. 의미임
 *        
 * 	
 * 		
 * 
 * 
 */

class MethodEx {
	
	public static int  Add(int a,int b) {
		
		/*
		 * int res = a + b
		 * 
		 * return res;
		 */
		
		return a + b;
		
	}
	public int Sub(int a,int b) {
		
		return a - b;
		
	}
	public int Mul(int a,int b) {
		
		return a * b;
		
	}
	public int Div(int a,int b) {
		
		return a / b;
		
	}
	
}

public class MethodEx01 {
	
	int aa() {// public은 생략이 가능하며 int 대신에 void로 반환하지 않는 
			  // 메소드를 만들 수 있다. void는 생략 할 수 없다.
		return 0;
	}

	public static void main(String[] args) { // main...이 그 파일안에 실행을 하는 문구이다
		

		int i=20;
		int j=30;
		
		int ij = MethodEx.Add(i, j);
		
		System.out.println("더한 결과 : "+ij);
		System.out.println("더한 결과 : "+MethodEx.Add(100, 200));

	}

}

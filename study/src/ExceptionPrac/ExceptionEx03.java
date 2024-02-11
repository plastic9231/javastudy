package ExceptionPrac;

/*
 * 프로그램에서 발생하는 에러
 * 1. 잘못된 문법을 사용하거나 변수 등을 정의하지 않은 상태에서 사용할 경우, 실행단계에서 컴파일러에 의해 발생하는 문법적 에러
 * 2. 프로그램을 실행할 때 발생하는 런타임 에러(개발자에 의한 논리적 에러 또는 시스템 이상현상으로 발생하는 에러)
 * 3. 프로그램 실행중 발생되는 비정상적인 상황을 의미하는 예외상황(ex:0으로 나누려고 하는 경우, 없는 파일을 열려고 하는 경우 등)
 * 
 * 정리해 놓은 문법(Exception)
 * - 예외는 프로그램 실행중 발생할 수 있는 명령어의 정상적인 흐름을 방해하는 이벤트로 자바에서의 예외는 하나의 객체
 * - 자바에서의 모든 예외 클래스는 Throwable클래스나 하위클래스를 상속받아 처리
 * 
 * * Throwable클래스에서 파생된 클래스
 * - Exception
 * - Error
 * 
 * * 많이 활용되는 예외 클래스
 * 1. checked exception
 * - 메소드 내에서 발생한 예외
 * - 메소드르 정의할때 throws문에 메소드 내에서 발생할 수 있는 예외를 명시해주거나 그 예외를 try~catch문 등을 이용해 처리해주는 예외
 * 
 * 2. unchecked exception
 * - 실행 시(런타임) 발생하는 예외를 의미
 * - 
 * 
 * * java.lang.Throwable 클래스의 주요 메소드
 * - void printStackTrace(PrintStream s)
 * - void printStackTrace(PrintWriter s) 
 * - 표준 출력 스트림에 스택 호출 목록을 마지막 메소드로부터 출력
 * 
 * * 중요한 런타임 예외 클래스
 * - ArtithmeticsException			: 계산상의 오류
 * - ArrayStoreException			: 배열에 잘못된 데이터행을 저장하려는 경우
 * - IndexOutOfBouundsException 	: 인덱스 범위를 벗어난 경우
 * - ClassCaseException 			: 객체의 형변환을 잘못한 경우
 * - NullPointerException 			: 빈 객체를 참조하는 경우(초기화 되지 않은 변수를 사용할 경우)
 * - SecurityException 				: 자바의 보안사항을 위반한 경우
 */

import java.io.*;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int a, b, c;
		
		try {
			System.out.print("첫번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			c = a+b;
			System.out.println("결과 : "+c);
		}catch(IOException e) {
			//IOException ---> checked exception
			//메소드를 정의할 때 throws한 예외
			//잡아내거나 던지지 않을 경우 컴팡리 에러가 발생
			System.out.println(e.toString());
		}catch(NumberFormatException ne) {
			//System.out.println(ne.toString());
			//ne.printStackTrace();
			//System.out.println("숫자형식이 아니빈다~~");
			System.out.println(ne.getMessage());
		};
		
		/*
		 * printStackTrace() : 예외발생 당시의 호출스택에 있었던 메소드의 정보와 예외 메세지를 출력
		 * getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻어서 출력
		 */

	}

}

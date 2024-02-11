package ClassMethodPrac;

public class AirConUse {

	/*
	 * 객체의 변수와 메소드를 사용하는 클래스
	 * 실행 클래스 : main()을 포함한 클래스, 자바의 파일명과 동일한 이름의 클래스
	 */
	public static void main(String[] args) {
		
		//객체생성
		//형식 : 클래스명 객체명 = new 생성자함수()->클래스명과 같게;
		AirCon airCon;			//객체선언(자료형이 AirCon클래스 자료형인 AirCon참조변수를 선언)
		airCon = new AirCon();	//객체생성(new 연산자를 사용해서 메모리상에 airCon객체를 만듬)
		
		/*
		AirCon[] airCon = new AirCon[10];	//객체배열선언
		
		for(int i=0; i<airCon.length; i++) {
			airCon[i] = new AirCon();		//선언된 객체배열에 메모리할당(객체생성)
		}
		*/
		
		//변수사용
		airCon.company = "가장 좋은 회사";
		airCon.color = "흰색";
		airCon.price = 10000;
		airCon.size = 10;
		airCon.temp = 25;
		
		//메소드호출
		airCon.tempUp();
		System.out.printf("에어컨 온도는 %d도%n", airCon.temp);
		airCon.tempUp();
		System.out.printf("에어컨 온도는 %d도%n", airCon.temp);
		
	}

}

package ClassMethodPrac;

/*
 * 클래스 설계
 * 
 * 클래스의 정의
 * 
 * class 클래스명 {
 * 	변수(필드 : 속성)
 * 	함수(메서드 : 기능)
 * }
 */

public class AirCon {

	//필드(변수) 정의
	String company;//사명
	String color;	//색상
	int price;		//가격
	int size;		//크기
	int temp;		//온도
	
	//source -> 
	
	
	//메소드(함수) 정의
	/*
	 * 메소드 형식
	 * 
	 * 접근제한자 반환병 메소드명(자료형 매개변수,...) {
	 * 	
	 * 수행문
	 * 
	 * } 
	 * 
	 * 접근제한자
	 * - 메소드 : public
	 * - 필드 : private
	 */
	
	//메소드 정의
	public void powerOn() {
		System.out.println("power on");
	}
	public void powerOff() {
		System.out.println("power off");
	}
	
	public void tempUp() {
		temp++;
	}
	public void tempDown() {
		temp--;
	}
	
	public String getCompany() {
		return company;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public int getTemp() {
		return temp;
	}	
	
}

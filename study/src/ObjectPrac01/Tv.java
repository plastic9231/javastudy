package ObjectPrac01;

public class Tv {	//클래스(객체)의 선언, 정의
	//클래스의 구성요소 : 필드(속성), 메소드
	
	//필드 : 속성
	String color; 	//색상
	boolean power;	//전원에 대한 상태
	int channel; 	//채널
	
	//메소드
	void power() {
		//기능 수행
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}

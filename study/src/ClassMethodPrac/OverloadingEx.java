package ClassMethodPrac;

/*
 * 메소드 오버로딩
 * 
 * - 하나의 클래스에서 같은 이름을 가진 메소드를 여러개 정의하는 것
 * - 같은 이름의 메소드에는 인자가 달라야한다.
 * - 인자가 다르다는 것은 개수가 다르거나, 자료형이 다르거나, 인수의 순서가 다르다는 것을 의미
 * - 같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아, 이름을 같게 만들어 일관성을 유지하기 위함
 * 
 * 형식
 * 접근제한자 반환형 메소드명(자료형 인자1, 자료형 인자2,..) {		//접근제한자 반환형 그리고 자료형 인자는 달라야하나, 반드시 메소드명은 같아야한다.
 * 	
 * }
 * 
 */

public class OverloadingEx {
	
	public void getLength(int n) {
		String s = String .valueOf(n);
		getLength(s);		//메소드 호출가능
	}
	
	void getLength(float n) {
		String s = String .valueOf(n);
		getLength(s);
	}
	
	public int getLength(String str) {
		System.out.println("입력한 값의 길이 : "+str.length());
		return 0;
	}
	
}

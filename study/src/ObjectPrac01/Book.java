package ObjectPrac01;

public class Book { // 클래스 명
	
	// 클래스 속성, 멤버변수, 멤버 필드
	static String name;
	// static은 객체를 생성하지 않아도 클래스명만으로 접근이 가능해 지는것
	// BookEx.java 의 26줄과 이어짐
	String writer;
	// BookEx.java 의 27줄과 이어짐
	final int price=20;
	// BookEx.java 의 42줄과 이어짐
	static int nowPage;
	// int nowPage; instance 변수를 사용할 경우 24줄에 오류가 생긴다.
	String isnb;
	
	// 생성자 함수
	public Book() {
		name = "홍길동전";
		// price=20; 지금은 final 변수이기 때문에 변경이 불가능하다.
	}
	
	// 메소드, 멤버 메소드
	public static void nextPage() {
		nowPage++;// static메소드 안에서는 instance 변수를 사용할 수 없다.
	}
	
	public void previousPage() {
		nowPage--;
	}
}

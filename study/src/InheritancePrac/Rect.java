package InheritancePrac;

/*
 * 상속시 주의사항
 * 상위 클래스에서 선언된 멤버변수와 하위 클래스에서 선언된 멤버변수가 같으면 상위 클래스의 멤버변수는 무시된다.
 * 단, 상위 클래스의 멤버변수를 사용하고자 한다면 super키워드를 사용한다.
 * 
 * 동일한 이름의 멤버변수나 메소드가 한 클래스 안에 정의되는 경우, 일단 에러가 발생됨.
 * 단, 메소드의 경우 매개변수의 개수나 타입이 다른경우는 에러가 발생하지 않고 다른 메소드로 취급된다.(오버로딩)
 */

public class Rect extends Shape {
	
	private int w, h;
	
	public Rect() {
		
	}
	
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = this.w*this.h;
		write();		//부모메소드, 오버라이드되서 이제 본인메소드
	}
	
	@Override
	public void write() {
		System.out.printf("w : %d, h : %d%n", w, h);
		System.out.println("사각형의 넓이 : "+area);
		super.write();
	}

}

package InheritancePrac;

public class Shape {		//부모클래스
	
	private String title;
	protected double area;
	
	public Shape() {
		System.out.println("인자가 없는 기본 생성자");
	}
	
	//문자열을 매개변수로 받는 생성자
	public Shape(String title) {		//오버로딩
		this.title = title;
	}
	
	public void write() {
		System.out.println(title+" "+area);
	}

}

package ObjectPrac02;

public class CircleEx {

	public static void main(String[] args) {
		
		//Circle 클래스의 인스턴스(객체)생성
		Circle cr = new Circle();
		
		//입력 메소드 호출
		cr.input();
		
		//계산 메소드 호출, 반환값을 저장
		double a = cr.area();
		double b = cr.length();
		
		//결과출력
		cr.print(a, b);

	}

}

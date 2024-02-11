package ObjectPrac02;

public class RectEx {

	public static void main(String[] args) {
		
		//Rect 클래스의 인스턴스(객체)생성
		Rect re = new Rect();
		
		//입력 메소드 호출
		re.input();
		
		//계산 메소드 호출, 반환값을 저장
		int a = re.area();
		int b = re.length();
		
		//결과출력
		re.print(a, b);

	}

}

package InnerPrac;

public class LocalClassEx01 {

	public static void main(String[] args) {
		
		final int x = 100;		//지역변수
		
		class innerEx04 {		//로클클래스
			int y = 200;		//내부클래스의 인스턴스 변수
			
			void aaa() {
				System.out.println("x : "+x);
				System.out.println("y : "+y);

			}
		}
		
		innerEx04 in = new innerEx04();	//내부객체를 통해서 내부객체가 가지고 있는 멤버에 접근가능
		
		System.out.println("x : "+x);
		System.out.println("y : "+in.y);
		in.aaa();

	}

}

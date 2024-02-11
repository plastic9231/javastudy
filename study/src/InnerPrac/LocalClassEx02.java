package InnerPrac;

public class LocalClassEx02 {

	int a = 100;	//인스턴스 변수
	
	public void innerEx(int k) {
		int b = 200; 	//지역변수
		final int c = k;	//상수
		
		class Inner {	//로컬클래스
			void getData() {	//이너클래스가 가지고 있는 인스턴스 메소드
				System.out.println("a : "+a);
				System.out.println("b : "+b);
				System.out.println("c : "+c);
			}
		}
		Inner in = new Inner();
		in.getData();
	}
	
	public static void main(String[] args) {
		
		LocalClassEx02 lc = new LocalClassEx02();
		
		lc.innerEx(1000);
		

	}

}

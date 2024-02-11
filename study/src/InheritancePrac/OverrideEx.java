package InheritancePrac;

public class OverrideEx {

	public static void main(String[] args) {
		
		SuperEx ss1 = new SuperEx("1111", "홍길동", 60, 80, 90);
		SuperEx ss2 = new SuperEx("1111", "홍길동", 100, 100, 100);
		
		System.out.println(ss1);
		System.out.println(ss2);
		
		if(ss1.equals(ss2)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		};

	}

}

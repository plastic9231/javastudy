package AbstractPrac;

public class AbsEx extends AbsEx2 {

	public static void main(String[] args) {
		
		AbsEx ae = new AbsEx();
		
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
	}

	@Override
	public String getStr() { // AbsEx2 추상메소드를 재정의한 것임

		return str;	// str은 AbsEx1의 멤버필드이다.
	}

}

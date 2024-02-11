package ObjectPrac02;

public class ThisExMain {

	public static void main(String[] args) {
		
		ThisEx te = new ThisEx("홍길동","111111-1111111", "02-1234-5678");
		
		System.out.printf("이름 : %s%n", te.getName());
		System.out.printf("주민 : %s%n", te.getJumin());
		System.out.printf("폰번 : %s", te.getTel());

	}

}

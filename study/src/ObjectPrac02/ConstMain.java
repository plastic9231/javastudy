package ObjectPrac02;

public class ConstMain {

	public static void main(String[] args) {
		
		ConstEx ce = new ConstEx();		//인스턴스가 생성되는 시점에서 생성자 함수가 호출된다.
		
		System.out.println(ce.num);
		System.out.println(ce.getNum());

	}

}

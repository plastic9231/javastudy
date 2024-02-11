package InterfacePrac;

interface Demo2 {		//인터페이스
	public void write();
	public void print();
}

//인터페이스를 상속한 추상클래스
abstract class DemoImpl2 implements Demo2 {
	
	@Override
	public void write() {
		System.out.println("바바보");
		
	}
}

//일반클래스에서 추상클래스 상속
class DemoImplSub2 extends DemoImpl2 {

	@Override
	public void print() {
		System.out.println("바보");
		
	}	
}

public class InterfaceEx4 {

	public static void main(String[] args) {

		DemoImplSub2 ob2 = new DemoImplSub2();
		ob2.print();
		ob2.write();

	}

}

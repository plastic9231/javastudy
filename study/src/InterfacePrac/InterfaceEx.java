package InterfacePrac;

public class InterfaceEx implements InterEx {		//인터페이스를 상속한 구현체

	public static void main(String[] args) {
		
		InterfaceEx ie = new InterfaceEx();
		System.out.println(ie.getA());

	}
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return 0;
	}

}

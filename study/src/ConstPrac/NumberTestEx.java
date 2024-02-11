package ConstPrac;

public class NumberTestEx {

	public static void main(String[] args) {
		
		/*
		//객체생성
		NumberTest nt = new NumberTest();
		
		System.out.println(nt.num);
		System.out.println(nt.getNumber());
		
		NumberTest nt2 = new NumberTest();
		System.out.println(nt2.getNumber());
		System.out.println("========================");
		
		//NumberTest1 nt1 = new NumberTest1();
		//해당 클래스에는 사용자 정의 생성자가 존재할 뿐이고, 기본생성자는 존재하지 않음. 
		//사용자 정의 생성자가 있을 경우 기본생성자는 자동으로 생성되지 못함.
		//사용자가 기본생성자를 만들어 주어야한다.
		
		NumberTest1 nt1 = new NumberTest1(100);
		//인자전달 : 100
		//객체 생성과 동시에 인자값이 있는 생성자를 호출하게 됨
		
		System.out.println(nt1.getNumber());
		System.out.println("========================");
		
		NumberTest2 nt3 = new NumberTest2();
		NumberTest2 nt4 = new NumberTest2(300);
		System.out.println(nt3.x);
		System.out.println(nt4.x);
		System.out.println("========================");
		
		NumberTest3 t1 = new NumberTest3();
		NumberTest3 t2 = new NumberTest3(4);
		NumberTest3 t3 = new NumberTest3(4.0);
		NumberTest3 t4 = new NumberTest3(4, 4.0);
		
		System.out.println(t1.val1+" "+t1.val2);
		System.out.println(t2.val1+" "+t2.val2);
		System.out.println(t3.val1+" "+t3.val2);
		System.out.println(t4.val1+" "+t4.val2);
		System.out.println("========================");
		*/
		
		NumberTest4 nbt = new NumberTest4();
		nbt.print();

	}

}

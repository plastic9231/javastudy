package InheritancePrac;

import java.io.*;

public class ABClass {

	public static void main(String[] args) throws IOException {
		
		//객체생성
		BClass bc = new BClass();
		
		if(!bc.input()) {
			System.out.println("Error!!");
			return;
		};
		
		double re = bc.calc();	//반환
		
		bc.write(re);
	}

}

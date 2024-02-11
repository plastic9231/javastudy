package ObjectPrac02;

import java.io.*;

public class HapEx {

	public static void main(String[] args) throws IOException {
		
		Hap hp = new Hap();
		
		hp.input();
		
		int a = hp.calculate();
		
		hp.print(a);

	}

}

package ClassMethodPrac;

import java.util.*;

public class MethodEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Method m = new Method();
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		//메소드 호출
		System.out.println(m.Add(a, b));
		int aa = m.Add(10, 20);
		System.out.println(aa);

	}

}

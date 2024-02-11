package StackPrac;

import java.util.*;

public class VectorEx05 {

	public static void main(String[] args) {
		
		Vector<MyData> v = new Vector<MyData>();
		
		v.add(new MyData("가길동", 23));
		v.add(new MyData("나길동", 24));
		v.add(new MyData("다길동", 25));
		
		for(MyData my : v) {
			System.out.printf("이름 : %s, 나이 : %d%n", my.name, my.age);
		};
		

	}

}

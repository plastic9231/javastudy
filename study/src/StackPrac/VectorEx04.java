package StackPrac;

import java.util.*;

public class VectorEx04 {
	
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		for(String str : colors) {
			v.add(str);
		};
		
		System.out.println("==== 전체출력 ====");
		
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		//검색
		String s = "노랑";
		if(v.contains(s)) {	//검색값이 존재한다면
			int i = v.indexOf(s)+1;
			System.out.println(s+" --> "+i+"\n");
		};
		
		//삭제
		v.remove(0);		//위치로 하든
		v.remove("초록");	//이름을 직접입력하든
		
		System.out.println("==== 삭제 후 출력 ====");
		
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");

	}

}

package StackPrac;

import java.util.*;

public class VectorEx01 {

	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};
	
	public static void main(String[] args) {
		
		int i;
		String str;
		
		Vector v = new Vector();
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		for(i=0; i<colors.length; i++) {
			v.add(colors[i]);
		};
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		//일본 스타일
		str = (String)v.firstElement();
		System.out.println("첫번째 요소 : "+str);
		
		str = (String)v.get(1);
		System.out.println("두번째 요소 : "+str);
		
		str = (String)v.lastElement();
		System.out.println("마지막 요소 : "+str);
		
		System.out.println("===== 전체 요소 출력 =====");
		/*
		Iterator it = v.iterator();
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.println(str+" ");
		};
		*/
		
		for(Object o : v) {
			str = (String)o;
			System.out.print(str+" ");
		}

	}

}

package StackPrac;

import java.util.*;

public class VectorEx03 {
	
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		for(String str : colors) {
			v.add(str);
		};
		
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("두번째 요소 : "+v.get(1));
		System.out.println("마지막 요소 : "+v.lastElement());
		
		System.out.println("==== 전체출력 ====");
		
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		//첫번째 요소값을 하양으로 바꾸기
		v.set(0, "하양");
		System.out.println("첫번째 요소 : "+v.firstElement());
		//System.out.println("요소 개수 : "+v.size());
		System.out.println("==== 전체출력 ====");
		
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		//첫번째 요소값에 보라를 집어넣기
		v.insertElementAt("보라", 0);
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("요소 개수 : "+v.size());
		System.out.println("==== 전체출력 ====");
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		//오름차순 정렬
		Collections.sort(v);
		System.out.println("==== 오름차순 정렬 후 ====");
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		//검색 : 오름차순 정렬 후 자료검색이 가능
		int idx = Collections.binarySearch(v, "노랑");
		System.out.println("노랑의 위치는 "+idx);
		
		int idx2 = Collections.binarySearch(v, "회색");
		System.out.println("회색의 위치는 "+idx2);		//찾으려는 데이터가 없으면 음수를 출력
		System.out.println();
		
		//내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("==== 내림차순 정렬 후 ====");
		for(String str : v) {
			System.out.print(str+" ");
		};
		System.out.println("\n");
		
		idx = Collections.binarySearch(v, "노랑", Collections.reverseOrder());
		System.out.println("노랑색의 위치 : "+idx);
		System.out.println();
	}

}

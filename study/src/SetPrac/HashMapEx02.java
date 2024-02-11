package SetPrac;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가길동", 90);
		map.put("나길동", 100);
		map.put("다길동", 60);
		map.put("라길동", 80);
		
	
		/*
		 * 키와 값(쌍)을 set형태로 만들어 저장
		 *	(HaspMap을 이용하여 Key와 value을 묶어주기 위해 entry를 사용한다.)
		 * 
		 * 	맵의 엔트리(키와 값의 한쌍(페어))
		 * 	Map.entrySet() 메소드는 이클래스에 속하는 요소를 가지는
		 * 	맵의 컬렉션을 반환해 준다.
		 * 	맵 엔트리값을 취득하는 방법 반복자를 이용하여 얻는다.
		 */
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		// 키값만 출력
		Set<String> set2 = map.keySet();
		System.out.println("이름 : " + set2);
		
		Collection<Integer> v = map.values();
		// 값을 컬렉션에 저장
		Iterator<Integer> it2 = v.iterator();
		System.out.print("점수 : ");
		int sum = 0;
		while(it2.hasNext()) {
			int i = it2.next();
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/set2.size());
		System.out.println("최고점수 : " + Collections.max(v));
		System.out.println("최고점수 : "+ Collections.min(v));
		
		
		
		
		
		
		
		
		
		

	}

}

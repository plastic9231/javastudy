package SetPrac;

import java.util.*;

public class HashMapEx01 {

	public static void main(String[] args) {
			
		// Map<키, 값> : 키는 중복을 허용하지 않는다.
						// 만약 키가 중복이 되면 키값이 변경되는 것이 아니라,
						// 값을 변경한다.
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("만화", "마녀배달부키키");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		System.out.println(map);
		System.out.println();
		
		String key;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.print(map.get(key) + " ");
		}
		System.out.println();
		
		map.put("영화", "달마야 놀자");
		// 키값이 같을때는 값이 변경된다.
		
		System.out.println(map);
		
		
		
		
		
		
		
	}
}

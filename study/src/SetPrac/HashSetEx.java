package SetPrac;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// Set : 순서가 없고 중복을 허용하지 않는다.
		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("삽살이");
		dog.add("풍산개");
		System.out.print("기존 데이터 set : ");
		System.out.println(dog);
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		dog.add("진돗개");
		dog.add("세퍼트");
		System.out.println();
		System.out.println(dog); // 데이터 추가 불가 및 오류 메시지 출력안됨
		
		

	}

}

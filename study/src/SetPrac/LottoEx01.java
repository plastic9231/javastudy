package SetPrac;

import java.util.*;

public class LottoEx01 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		List list = new LinkedList<>(set);
		Collections.sort(list);
		System.out.println(list);

		
		
		
		
		
		
		
		
		
		
	}

}

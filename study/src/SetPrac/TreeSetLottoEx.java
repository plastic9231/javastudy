package SetPrac;

import java.util.*;

public class TreeSetLottoEx {

	public static void main(String[] args) {


		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}

		System.out.println(set);
		
	}

}

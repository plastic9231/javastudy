package StackPrac;

import java.util.*;

public class QueueEx02 {
	
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		for(String str : colors) {
			q.offer(str);
		};
		
		while(q.peek()!=null) {
			System.out.print(q.poll()+" ");
		};

	}

}

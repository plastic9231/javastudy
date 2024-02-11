package StackPrac;

import java.util.*;

public class QueueEx01 {

	public static void main(String[] args) {
		
		String[] item = {"소나타","렉스톤","재규어"};
		LinkedList<String> q = new LinkedList<>();
		
		for(String n : item) {
			q.offer(n);		//데이터를 q에 추가
		};
		
		System.out.println("q의 크기 : "+q.size());
		
		String data = "";
		
		while((data=q.poll())!=null) {
			System.out.println(data+"삭제");
			System.out.println("q의 크기 : "+q.size());
		};

	}

}

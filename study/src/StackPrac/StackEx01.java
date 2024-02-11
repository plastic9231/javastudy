package StackPrac;

/*
 * Stack
 * - Stack은 객체를 후입선출(LIFO)하며, 객체를 저장할 때 push()메소드와 검출시 pop(), 스택의 가장위쪽객체를 의미하는 peek()메소드,
 * 	 스택이 비어있는지를 판별하는 empty(), 검색하는 search()메소드를 가지고 있음
 */

import java.util.*;

public class StackEx01 {

	public static void main(String[] args) {
		
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대한민국"};
		
		//스택생성
		Stack<String> stack = new Stack<>();
		
		for(String n : groupA) {
			stack.push(n);
		};
		
		System.out.println("저장 데이터 개수 : "+stack.size());
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		};

	}

}

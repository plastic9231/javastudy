package StackPrac;

import java.util.*;

public class StackEx02 {
	
	private static final String colors[] = {"검정","노랑","초록","파랑","빨강","연두"};
	
	public StackEx02() {
		Stack<String> st = new Stack<String>();
		
		for(String color : colors) {
			st.push(color);
		};		
		popStack(st);
	}
	
	void popStack(Stack<String> st) {
		System.out.print("pop : ");
		while(!st.empty()) {
			System.out.print(st.pop()+" ");
		}
	}

	public static void main(String[] args) {
		
		StackEx02 ss = new StackEx02();

	}

}

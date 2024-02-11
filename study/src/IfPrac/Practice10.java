package IfPrac;

import java.util.*;

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("무슨 커피를 드릴까요 : ");
		String coffee = sc.nextLine();
		
		switch(coffee) {
		case "아메리카노": 
			System.out.println("아메리카노는 2000원입니다.");
			break;
		case "카페라떼":
			System.out.println("카페라떼는 3500원입니다.");
			break;
		default:
			System.out.println("에베벱ㅂ베"); 
			return;
		}

	}

}

package Exam;

import java.util.*;

import Exam.Operator.*;

public class Calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("두 정수와 연산자를 입력해주세요(ex 5 + 1) : ");
			int num1 = sc.nextInt();
			String str = sc.next();
			int num2 = sc.nextInt();
			
			switch(str) {
			case "+":
				Add add = new Add();
		        add.setValue(num1, num2);
		        System.out.println("두 정수의 합은 " + add.calculate() + "입니다.");
		        break;
			case "-":
				Sub sub = new Sub();
		        sub.setValue(num1, num2);
		        System.out.println("두 정수의 차는 " + sub.calculate() + "입니다.");
		        break;
			case "*":
				Mult mult = new Mult();
		        mult.setValue(num1, num2);
		        System.out.println("두 정수의 곱은 " + mult.calculate() + "입니다.");
		        break;
			case "/":
				Div div = new Div();
		        div.setValue(num1, num2);
		        System.out.println("두 정수를 나눈 값은 " + div.calculate() + "입니다.");
		        break;
		    default :
		    	System.out.println("잘못 입력하셨습니다.");
			};
		}while(true);

	}

}

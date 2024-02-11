package IfPrac;

import java.util.*;

public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		
		System.out.print("2자리 정수를 입력해주세요 : ");
		number1 = sc.nextInt();
		
		if(number1>=100) {
			System.out.println("안돼");
			System.exit(0);
		}else if(number1<100&&number1>0) {
			String number2 = String.valueOf(number1);
	        char[] number3 = number2.toCharArray();
	        
	        int number4 = Character.getNumericValue(number3[0]);
	        int number5 = Character.getNumericValue(number3[1]);
	        
	        System.out.println("입력된 두 숫자 : "+number4+", "+number5);
	        
	        if(number4%3==0) {
	        	if(number5%3==0) {
	        		System.out.printf("박수짝짝");
	        	}else if(number5%3!=0) {
	        		System.out.printf("박수짝");
	        	}
	        }else if(number5%3==0) {
	        	if(number4%3==0) {
	        		System.out.printf("박수짝짝");
	        	}else if(number4%3!=0) {
	        		System.out.printf("박수짝");
	        	}
	        }else {
	        	System.out.println("꺼져");
	        	System.exit(0);
	        }
		};

	}

}

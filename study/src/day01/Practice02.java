package day01;

import java.util.*;
import java.io.*;

public class Practice02 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int number1;
		
		System.out.print("2자리 정수를 입력해주세요 : ");
		number1 = sc.nextInt();
		
		if(number1>=100) {
			System.out.println("꺼져");
			System.exit(0);
		}else if(number1<100&&number1>0) {
			String number2 = String.valueOf(number1);
	        char[] number3 = number2.toCharArray();
	        
	        if(number3[0]==number3[1]) {
	        	System.out.printf("10의 자리수'%s'와 1의 자리수'%s'는 같습니다.", number3[0], number3[1]);
	        }else if(number3[0]!=number3[1]) {
	        	System.out.printf("10의 자리수'%s'와 1의 자리수'%s'는 다릅니다.", number3[0], number3[1]);
	        }
		};
		
		
	}

}

package day01;

import java.util.*;
import java.io.*;

public class IFExam05 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("하나의 문자 입력 : ");
		//ch = sc.next().charAt(0);
		int n = System.in.read();
		//System.out.println(n);
		
		if(n>=65&&n<=90) {				//대문자인 경우
			n += 32;						//소문자로 변환
			ch = (char)n;
			System.out.println(ch);
		}else if(n>=97&&n<=122) {			//소문자인 경우
			n -= 32;						//대문자로 변환
			ch = (char)n;
			System.out.println(ch);
		}else {								//알파벳이 아닌 경우
			System.out.println("틀렸어");
		};

	}

}

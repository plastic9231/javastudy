package day01;

import java.util.*;
import java.io.*;

public class IFExam04 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("하나의 문자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.println(ch);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {					//소문자이거나 대문자일 경우
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {				//소문자의 모음일 경우
				System.out.println("당신이 입력하신 문자는 모음입니다.");
			}else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {		//대문자의 모음일 경우
				System.out.println("당신이 입력하신 문자는 모음입니다.");
			}else {
				System.out.println("당신이 입력하신 문자는 자음입니다.");
			}
		}else {
			System.out.println("당신이 입력하신 것은 알파벳이 아닙니다.");
		}

	}

}

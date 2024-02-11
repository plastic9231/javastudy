package IfPrac;

import java.sql.*;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("안녕 자바야");			//클래스(System).객체(out).메소드(println())
		System.out.println("안녕 단축키야");		//sysout을 치고나서 컨트롤+스페이스
		/*
		System.out.println("안녕 자바야");
		System.out.println("안녕 자바야");
		System.out.println("안녕 자바야");
		*/
		System.out.println("안녕 자바야");System.out.println("안녕 자바야");		//컨트롤+쉬프트+f를 누르면 자동정렬해줌
		System.out.println("안녕 자바야");

		System.out.println("안녕 자바야야");		//개행이 탑재되어 있음
		System.out.print("안녕자바야");			//개행이 없음
		
		int age = 10;
		String add = "홍길동";
		System.out.printf("내 나이는 %d살 입니다.%n",age);		//서식을 지정해서 출력
		System.out.printf("%d"+"%d %n", 10, 20);				//%d=정수, %f=실수, %s=문자열, %n=개행
		System.out.printf("%d+%d %n", 10, 20);
		System.out.printf("%f %n", 0.11);
		System.out.printf("%.2f %n", 0.11);						//%.소수점자리f = 소수점 자리수 설정가능
		System.out.printf("%s", add);
	}

}

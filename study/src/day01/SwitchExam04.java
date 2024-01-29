package day01;

import java.util.*;
import java.io.*;

public class SwitchExam04 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("주민번호 7번째자리 입력 : ");
		int n = System.in.read()-48;
		int year = 0;
		String gender = "";
		
		switch(n) {
		case 9:
		case 0:
			year = 1800; break;
		case 1:
		case 2:
			year = 1900; break;
		case 3:
		case 4:
			year = 2000; break;
		default:
			System.out.println("해당 년도가 없습니다.");
			System.exit(0);
		};
		
		if(n%2==0) {
			gender = "여성";
		}else {
			gender = "남성";
		};
		
		System.out.println("당신의 출생연대는 "+year+"년입니다.");
		System.out.println("당신의 성별은 "+gender+"입니다.");

	}

}

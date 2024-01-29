package day01;

import java.util.*;
import java.io.*;

public class Practice03 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int won;
		int oman = 0;
		int man = 0;
		int cheon = 0;
		int baek = 0;
		int osib = 0;
		int sib = 0;
		int ill = 0;
		System.out.print("금액을 입력해주세요 : ");
		won = sc.nextInt();
		
		if(won>0) {
			oman = won/50000;
			man = (won%50000)/10000;
			cheon = (won%10000)/1000;
			baek = (won%1000)/100;
			osib = (won%100)/50;
			sib = (won%50)/10;
			ill = (won%10)/1;
		}else {
			System.out.println("금액을 잘못 입력하셨습니다.");
		}
		
		System.out.printf("오만원권 %d장, 만원권 %d장, 천원권 %d장, 백원 %d개, 오십원 %d개, 십원 %d개, 일원 %d개", 
				oman, man, cheon, baek, osib, sib, ill);

	}

}

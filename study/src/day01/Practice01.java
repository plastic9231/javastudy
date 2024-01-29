package day01;

import java.util.*;
import java.io.*;

public class Practice01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int krw;
		double usd;
		
		System.out.print("원화를 입력해주세요 : ");
		krw = sc.nextInt();
		usd = krw/1300.0;
		
		if(krw>0) {
			System.out.printf("%d원은 %.1f달러입니다.", krw, usd);
		}else {
			System.out.println("잘못된 금액입니다.");
		}
		

	}

}

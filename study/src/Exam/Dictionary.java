package Exam;

import java.util.*;

public class Dictionary {
	
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			};
		};
		
		return "사전에 없습니다.";
	}
	
	public void show() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램");
		
		while(true) {
			System.out.print("한글단어 ? ");
			String word = sc.next();
			
			if (word.equals("그만")) {
				System.out.println("아 꺼져");
				System.exit(0);
			};
			
			String meaning = Dictionary.kor2Eng(word);
			System.out.println(word + "은(는) " + meaning);
		}
	}
}

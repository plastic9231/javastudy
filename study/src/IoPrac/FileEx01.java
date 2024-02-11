package IoPrac;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) {
		
		File file = new File("c:/ddd/classEx.txt");
		
		System.out.println("파일 여부 판정 : " + file.isFile());
		System.out.println("디렉토리(폴더)여부 : " + file.isDirectory());
		System.out.println("경로 : " + file.getPath());
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일의 길이 : " + file.length());
		// length() : 문자열일 때
		// length : 배열의 길이를 정수형으로 변환
		System.out.println("파일의 최종 수정 날짜 : " + file.lastModified());
	
		
	}

}

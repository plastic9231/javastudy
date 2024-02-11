package IoPrac;

//1. 파일생성
//2. 디렉토리생성
//3. 파일 혹은 디렉토리 삭제
//4. 이름변경(파일 및 디렉토리)
//5. 디렉토리 목록 추출

import java.io.*;

public class FileEx03 {

	public static void main(String[] args) throws IOException {
		
		// 파일 생성
		File f1 = new File("c:/ddd/newFile.txt");
		// 빈 파일 생성
		if(f1.exists()) { // 파일이나 디렉토리 존재여부를 확인하는 메소드
			System.out.println("파일 이름 : " + f1.getName());
		}
		else { // 파일이 존재하지 않으면 
			if(f1.createNewFile()) {
				System.out.println("새로운 파일을 만들었습니다.");
			}
		}
		
		// 디렉토리 생성
		File f2 = new File("c:/ddd/newDirectory");
		if(!f2.exists()) {
			f2.mkdir();
			System.out.println("디렉토리를 만들었습니다.");
		}
		else {
			System.out.println("디렉토리 이름 : " + f2.getPath());
		}
		
		/*
		// 파일 및 디렉토리 삭제
		File f3 = new File("c:/ddd/newDirectory");
		if(f3.exists()) {
			f3.delete();
		}
		else {
			System.out.println("파일이나 디렉토리가 존재하지 않습니다.");
		}
		*/
		
		// 파일 및 디렉토리 이름 변경
		File src = new File("c:/ddd/newFile.txt"); // 원본
		File dest = new File("c:/ddd/newDirectory/dest.txt"); // 변경된 파일1
		File dest2 = new File("c:/ddd/newDirectory/dest2.txt"); // 변경된 파일2
		
		// 원본파일이 존재하면 
		if(dest.exists()) {
			// src.renameTo(dest);
			src.renameTo(dest2);
			System.out.println("파일 이름이 변경되었습니다.");
		}
		
		// 디렉토리 목록 출력
		if(f2.isDirectory()) {
			String[] dir = f2.list();
			System.out.println("\n\n Dir Content : ===============\n");
			for(String dirs : dir) {
				System.out.println("dirs : " + dirs);
			}
		}
		
		
		
		
		
		
		

	}

}

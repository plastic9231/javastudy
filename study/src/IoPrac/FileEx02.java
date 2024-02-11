package IoPrac;

import java.io.*;

public class FileEx02 {

	public static void main(String[] args) {
		
		File directory = new File("c:/windows");

		if(directory.exists()) {
			if(directory.isDirectory()) {
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList) {
					System.out.println("파일 이름 : " + fileName);
				}
			}
		}
	
	}

}




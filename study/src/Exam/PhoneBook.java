package Exam;

import java.util.*;

public class PhoneBook {
	
	private Scanner sc;
	private Phone pArray[];
	
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	
	public void read() {		//인원을 입려받고, 이름과 전번을 입력받아 저장하는 기능구현
		System.out.print("인원 : ");
		int n = sc.nextInt();
			
		pArray = new Phone[n];	//n명을 저장할 배열을 선언
			
		for(int i=0; i<pArray.length; i++) {
			System.out.print("이름과 전번입력 : ");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		};
		System.out.println("저장되었스빈다..");
	}
	
	public String search(String name) {			//검색기능구현
		for(int i=0; i<pArray.length; i++) {
			if(pArray[i].getName().equals(name)) {
				return pArray[i].getTel();		//Phone클래스에 저장되어 있는 입력과 자신이 입력한 이름이 같으면 전화번호값을 반환
			};
		};
		return "";		//이름이 존재하지 않으면 null을 반환
	}
	
	public void run() {
		read();
		
		while(true) {
			System.out.print("검색할 이름 : ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("섭종합니다");
				break;
			};
			String tel = search(name);		//search()메소드에서 이름을 검색했을때 값이 있다면 전번을 반환받아 저장
			
			if(tel=="") {
				System.out.println(name+"이 없습니다.");
			}else {
				System.out.println(name+"의 전화번호는 "+tel+"입니다.");
			};
		};
		
	}

	public static void main(String[] args) {
		
		PhoneBook pb = new PhoneBook();
		pb.run();
	}

}

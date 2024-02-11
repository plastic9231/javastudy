package Exam;

import java.util.*;

public class MonthSchedule {
	
	private int nDays;
	private Day[] days;
	private Scanner sc;
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		};
		
		sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이입력) : ");
		String work = sc.next();
		day--;	//0~29면 가능
		
		if(day<0||day>30) {
			System.out.println("날짜를 잘못 입력하셨습니다.");
			return ;
		};
		
		days[day].set(work);
	}
	
	public void view() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		day--;	//0~29면 가능
		
		if(day<0||day>30) {
			System.out.println("날짜를 잘못 입력하셨습니다.");
			return ;
		};
		
		System.out.print((day+1)+"일의 할일은 ");
		days[day].show();
		
	}
	
	public void finish() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default :
				System.out.println("선택하신 메뉴가 없습니다.");
				
			}
			System.out.println();			
		}
	}

}

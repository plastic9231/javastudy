package gradeex;

import java.util.*;

public class Sung {
	
	Record rec[];
	
	int pop;	//인원수
	
	void set() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("인원수 입력 : ");
			pop = sc.nextInt();
		}while(pop<1 || pop>100);
		
		rec = new Record[pop];
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"국어점수 : ","영어점수 : ","수학점수 : "};
		
		for(int i=0; i<pop; i++) {
			rec[i] = new Record();		//인스턴스 생성
			
			System.out.print((i+1)+"번째 이름 입력 : ");
			rec[i].name = sc.next();
			
			for(int j=0; j<title.length; j++) {
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();		//입력받은 점수를 score[]에 저장
				
				rec[i].sum += rec[i].score[j];		//score[]에 저장된 점수를 받아 총점을 저장
			}
			
			rec[i].avg = rec[i].sum/3.0;			//평균을 계산
		}
	}
	
	private void ranking() {
		int i, j;
		
		for(i=0; i<pop; i++) {
			rec[i].rank = 1;
		};
		
		for(i=0; i<pop-1; i++) {		//0, 1
			for(j=i+1; j<pop; j++) {	//1, 2
				if(rec[i].avg>rec[j].avg) {
					rec[j].rank++;
				}else if(rec[i].avg<rec[j].avg) {
					rec[i].rank++;
				};
			};
		};
		
	}
	
	void print() {		//인원수에 해당하는 데이터 출력
		ranking();		//위에 ranking()메서드 가져오기
		
		String[] title2 = {"국어","영어","수학"};
		
		for(int i=0; i<pop; i++) {
			System.out.printf("%n%s%n", rec[i].name);
			
			for(int j=0; j<3; j++) {
				System.out.printf("%s점수 : %d%n", title2[j], rec[i].score[j]);
			};
			
			System.out.printf("총점 : %d  ", rec[i].sum);
			System.out.printf("평균 : %.2f  ", rec[i].avg);
			System.out.printf("등수 : %d", rec[i].rank);
			System.out.println();
		}
	}

}

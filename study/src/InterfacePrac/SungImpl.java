package InterfacePrac;

import java.util.*;

public class SungImpl implements Sung {
	
	int in;
	Record[] re;


	@Override
	public void set() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("인원 입력 : ");
			in = sc.nextInt();
		}while(in<1 || in>100);
		
		re = new Record[in];
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);		
		
		for(int i=0; i<re.length; i++) {
			re[i] = new Record();
			System.out.printf("%d번째 학생의 학번, 이름 입력 : ", i+1);
			re[i].numval = sc.nextInt();	//학번입력
			re[i].name = sc.next();		//이름 입력
			
			//점수입력
			System.out.print("국어 수학 영어점수 입력 : ");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			//과목별 평가
			for(int j=0; j<re[i].sco.length; j++) {
				
				if(re[i].sco[j]>=90) {
					re[i].scor[j] = "수";
				}else if(re[i].sco[j]>=80) {
					re[i].scor[j] = "우";
				}else if(re[i].sco[j]>=70) {
					re[i].scor[j] = "미";
				}else if(re[i].sco[j]>=60) {
					re[i].scor[j] = "양";
				}else {
					re[i].scor[j] = "가";
				}
			}
			
			//총점
			re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2];
			
			//평균
			re[i].avg = re[i].sum/3;
			
		}
	}

	@Override
	public void print() {
		
		for(int i=0; i<re.length; i++) {
			System.out.printf("%d %s -> 국어:%d(%s) 수학:%d(%s) 영어:%d(%s) 총점:%d 평균:%d%n", 
					re[i].numval, re[i].name, re[i].sco[0], re[i].scor[0], re[i].sco[1], re[i].scor[1], re[i].sco[2], re[i].scor[2], re[i].sum, re[i].avg);
		}

	}

}

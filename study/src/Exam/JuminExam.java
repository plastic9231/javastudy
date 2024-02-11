package Exam;

/*
 * 주민번호를 입력받아 입려한 주민번호가 올바른지를 검증하는 프로그램 구현
 * 9,0 : 1800년대
 * 1,2 : 1900년대
 * 3,4 : 2000년대
 * 
 * 홀수 : 9,1,3 -> 남자
 * 짝수 : 0,2,4 -> 여자
 * 
 * 지역
 * 0 : 서울
 * 1 : 경기,인천
 * 2 : 부산
 * 3 : 강원도
 * 4 : 충청도
 * 5 : 전라도
 * 6 : 대구,광주
 * 7 : 경북,경남
 * 8 : 경남
 * 9 : 제주도
 * 
 * 시,도 : c,d
 * 동,읍,면 : e,f
 * 번호가 올바른지 아닌지는 : 판별숫자(g)
 * 
 * int hap = 0
 * hap += 주민번호 첫번째 자리(1)*2
 * hap += 주민번호 두번째 자리(2)*3
 * hap += 주민번호 세번째 자리(3)*4
 * hap += 주민번호 네번째 자리(4)*5
 * hap += 주민번호 다섯번째 자리(5)*6
 * hap += 주민번호 여섯번째 자리(6)*7
 * 7번째 자리는 '-'이므로 계산에서 제외
 * hap += 주민번호 여덟번째 자리(a)*8
 * hap += 주민번호 아홉번째 자리(b)*9
 * hap += 주민번호 열번째 자리(c)*2
 * hap += 주민번호 열한번째 자리(d)*3
 * hap += 주민번호 열두번째 자리(e)*4
 * hap += 주민번호 열세번째 자리(f)*5
 * 
 * 주민번호의 마지막(열네번째 자리)을 의미하는 g
 * - float temp = (hap/11.0f)*11.0f+11.0f-hap
 * - float temp1 = temp-(int)(temp/10.0f)*10.0f
 */

import java.io.*;
import java.util.*;

public class JuminExam {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		int[] jumin = new int[14];
		boolean right = false;
		
		System.out.print("이름 : ");
		name = in.readLine();
		
		do {
			right = false;
			
			System.out.print("주민번호(ex. 111111-1111111) : ");
			for(int i=0; i<jumin.length; i++) {
				jumin[i] = System.in.read()-48;
			}
			System.in.read();
			System.in.read();
			
			if(jumin[2]*10+jumin[3]>12) {
				System.out.println("태어난 달은 12월보다 클 수 없습니다.");
				continue;
			}else if(jumin[4]*10+jumin[5]>31) {
				System.out.println("태어날 일은 31일보다 클 수 없습니다.");
				continue;
			}else if(jumin[7]!=9&&jumin[7]!=0&&jumin[7]!=1&&jumin[7]!=2&&jumin[7]!=3&&jumin[7]!=4) {
				System.out.println("성별을 나타내는 숫자는 ");
				System.out.println("9, 0, 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}
			
			//주민번호 검증
			int hap = 0, cre = 2;
			float temp = 0.0f, temp1 = 0.0f;
			
			for(int i=0; i<jumin.length; i++) {
				if(i==6) {
					continue;
				};
				hap += jumin[i]*cre;
				cre++;
				
				if(cre==10) {
					cre = 2;
				};
			};
			
			temp = (hap/11.0f)*11.0f+11.0f-hap;
			temp1 = temp-(int)(temp/10.0f)*10.0f;
			
			if(temp1!=jumin[13]) {
				System.out.println("주민번호 검증 수가 올바르지 않습니다.");
				continue;
			};
			
			right = true;
			
		}while(!right);
		
		System.out.println();
		System.out.println("이름 : "+name);
		
		System.out.print("주민번호 : ");
		for(int i=0; i<jumin.length; i++) {
			if(i==6) {
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		};
		
		System.out.println();
		System.out.print("생년월일 : ");
		int year = 0, month = 0, day = 0;
		switch(jumin[7]) {
		case 9:
		case 0:
			year = 1800;
			break;
		case 1:
		case 2:
			year = 1900;
			break;
		case 3:
		case 4:
			year = 2000;
			break;
		}
		year += jumin[0]*10+jumin[1];
		month = jumin[2]*10+jumin[3];
		day = jumin[4]*10+jumin[5];
		System.out.printf("%d년 %d월 %d일%n", year, month, day);
		
		System.out.print("성별 : ");
		System.out.println(jumin[7]%2==0 ? "여성":"남성");
		
		System.out.println("태어난 시, 도 : ");
		String area = "";
		switch(jumin[8]) {
		case 0:
			area = "서울";
			break;
		case 1:
			area = "경기, 인천";
			break;
		case 2:
			area = "부산";
			break;
		case 3:
			area = "강원도";
			break;
		case 4:
			area = "충청도";
			break;
		case 5:
			area = "전라도";
			break;
		case 6:
			area = "대구, 광주";
			break;
		case 7:
			area = "경북, 경남";
			break;
		case 8:
			area = "경남";
			break;
		case 9:
			area = "제주도";
			break;
		}
		System.out.println(area);
		
		System.out.println("나이 : ");
		Calendar ca = Calendar.getInstance();
		int ago = ca.get(Calendar.YEAR)-year+1;
		System.out.println(ago);
		System.out.println("세");

	}

}

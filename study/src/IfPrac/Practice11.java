package IfPrac;

import java.util.*;

public class Practice11 {

	public static void main(String[] args) {
		
		//String[] rsp = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			System.out.print("철수야 가위 바위 보!!! : ");
			String chul = sc.nextLine();	
			
			System.out.print("영희야 가위 바위 보!!! : ");
			String young = sc.nextLine();	
			
			//int tmp = (int)(Math.random()*3);
			//System.out.println(rsp[tmp]);
			
			 if(chul.equals("가위")&&young.equals("보") ||
				     chul.equals("바위")&&young.equals("가위") ||
				     chul.equals("보")&&young.equals("바위")) {
				 System.out.println("철수가 이겼습니다.");
			 };
			 
			 if(young.equals("가위")&&chul.equals("보") ||
					 young.equals("바위")&&chul.equals("가위") ||
					 young.equals("보")&&chul.equals("바위")) {
				 System.out.println("영희가 이겼습니다.");
			 };

		};

	}

}

package BankExam;

import java.io.*;

public class Banking {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Account na = new Account("이승환");
		
		String strWork;		//작업내용을 입력받아 저장할 변수
		
		do {
			System.out.println("\n\n 작업 내용을 선택하세요.");
			System.out.println("===============================");
			System.out.println("입    금==================>   1");
			System.out.println("입    금==================>   2");
			System.out.println("잔액조회==================>   3");
			System.out.println("종    료==================>   0");
			
			System.out.print("작업을 선택하세요. : ");
			strWork = br.readLine();
			
			int switchInt = 0;
			
			if(strWork!=null) {
				switchInt = Integer.parseInt(strWork);
			}else {
				System.out.println("작업내용을 입력하지 않으셨습니다.");
				System.exit(0);
			};
			
			switch(switchInt) {
			case 0 : break;
			case 1 : 
				System.out.println("\n===============================");
				System.out.print("입금 금액 입력 : ");
				String strdepositIn = br.readLine();
				
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);	
			case 2 :
				System.out.println("\n===============================");
				System.out.print("출금 금액 입력 : ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.deposit(withdrawLong);
			case 3 : 
				System.out.println(na.getName()+"님의 잔고는"+na.getBalance()+"원입니다.");
				break;
			default :
				System.out.println("작업선택번호는 0~3번사이입니다.");
			};
			
		}while(!strWork.equals("0"));

	}

}

package ObjectPrac02;

import java.io.*;

public class Hap {
	
	int num, sum;
	
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수를 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		while(num<=0 || num>100) {
			System.out.println("다시입력해주세요");
			System.out.print("임의의 정수를 입력 : ");
			num = Integer.parseInt(br.readLine());
		};
	}
	
	int calculate() {
		for(int i=1; i<=num; i++) {
			sum += i;
		};
		return sum;
	}
	
	void print(int a) {
		System.out.printf("1부터 입력한 정수%d까지의 합 : %d", num, a);
	}
}

package ForPrac;

public class ForExam02 {

	public static void main(String[] args) {
		
		int i;
		int even = 0;
		int odd = 0;
		
		for(i=1; i<=100; i++) {
			if(i%2==0) {
				even += i;
			}else if(i%2!=0) {
				odd += i;
			}
		}
		System.out.printf("1부터 %d까지의 짝수합 : %d%n", (i-1), even);
		System.out.printf("1부터 %d까지의 홀수합 : %d%n", (i-1), odd);
		System.out.printf("1부터 %d까지의 전체합 : %d%n", (i-1), (even+odd));

	}

}

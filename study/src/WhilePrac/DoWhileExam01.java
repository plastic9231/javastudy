package WhilePrac;

public class DoWhileExam01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.printf("1~%d까지의 합계 : %d", (i-1), sum);

	}

}

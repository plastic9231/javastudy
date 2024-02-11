package ForPrac;

/*
 * for문 형식
 * for(조건문) {
 * 		수행문
 * }
 */

public class ForExam01 {

	public static void main(String[] args) {
		
		int i, j;
		int sum=0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			
		};
		
		System.out.printf("1부터 %d까지의 합 : %d%n%n", (i-1), sum);
		
		for(i=10; i>=1; i--) {
			System.out.println(i);
		};
		
		for(i=0, j=10; i<=10; i++, j--) {
			System.out.printf("%d\t%d%n", i, j);
		};
		
		

	} 

}

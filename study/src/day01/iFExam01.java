package day01;
/*	조건문
 * 	조건문은 조건식과 문장을 블럭으로 구성되어 있다.
 * 	조건문의 종류로는 if문과 switch-case문이 있다.
 * 	
 * 	형식
 * 	if(조건식) {
 * 		조건이 참일 경우 수행할 문장
 * 	}else {
 * 		조건이 거짓일 경우 수행할 문장
 * 	}
 */
public class iFExam01 {

	public static void main(String[] args) {
		int x = 0;
		//System.out.println("x = "+x);
		
		if(x==0) System.out.println("x == 0");
		if(x!=0) System.out.println("x != 0");
		if(!(x==0)) System.out.println("나와랑~~");
		if(!(x!=0)) System.out.println("나와랑!!");
		System.out.println("");
		
		x =1;
		
		if(x==0) System.out.println("x == 0");
		if(x!=0) System.out.println("x != 0");
		if(!(x==0)) System.out.println("나와랑~~");
		if(!(x!=0)) System.out.println("나와랑!!");
	}

}

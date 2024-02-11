package ObjectPrac01;
import java.util.*;

public class Exam02 {
	
	Scanner sc = new Scanner(System.in);
	
	double add(double a, double b) {
		
		double c= a+b;
		return c;
	}
	double sub(double a, double b) {
		double c= a-b;
		return c;
	}
	
	double mul(double a, double b) {
		double c =a*b;
		return c;
	}
	double div(double a, double b) {
		double c = a/b;
		return c;
	}
	double namu(double a, double b) {
		double c = a%b;
		return c;
	}
	
	double print() {
		double []d = new double [2];
		double res = 0;
		
		Exam02 add = new Exam02();

			System.out.println("계산기 ex)1*1");
			d[0] = sc.nextInt(); 
			char de = sc.next().charAt(0);
			d[1] = sc.nextInt();
			for(;;) {
				
		if(de==('+')) {
			d[0] = add.add(d[0],d[1]);
		}
		else if(de==('-')) {
			d[0] = add.sub(d[0],d[1]);
		}
		else if(de==('*')) {
			d[0] = add.mul(d[0],d[1]);
		}
		else if(de==('/')) {
			d[0] = add.div(d[0],d[1]);
		}
		else if(de==('%')) {
			d[0] = add.namu(d[0],d[1]);
		}
		
		System.out.println(d[0]);
		res=d[0];
		System.out.println("추가 계산 ex) * 1");
		de = sc.next().charAt(0);
		if(de=='x') {
			System.out.print("최종 결과는 "+d[0]+"입니다.\n프로그램을 종료합니다");
			return d[0];
		}
		d[1] = sc.nextInt();
			}
	}
			
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String as;
		Exam02 print = new Exam02();
		
		System.out.println("계산기를 실행하시겠습니까?");
		as = sc.next();
		if(as.equals("예")) {
		double res = print.print();
		}
		else {
			System.out.println("프로그램을 종료했습니다.");
		}
	}

}

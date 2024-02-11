package ArrayPrac;

public class ArrayExam09 {

	public static void main(String[] args) {
		
		int[][] test;
		test = new int[2][3];
		
		test[0][0] = 1;
		test[0][1] = 2;
		test[0][2] = 3;
		test[1][0] = 4;
		test[1][1] = 5;
		test[1][2] = 6;
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<=test.length; j++) {
				System.out.printf("%3d", test[i][j]);
			};
			System.out.println();
		};

	}

}

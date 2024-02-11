package ArrayPrac;

public class ArrayExam08 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int n = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = n;
				System.out.printf("%3d", arr[i][j]);		
				n++;
			};
			n = i+2;		//n값을 재설정해서 (1,0)의 n값을 6에서 2로 조정함
			System.out.println();
		};

	}

}

package ArrayPrac;

public class ArrayExam07 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = n;
				System.out.printf("%3d", arr[i][j]);
				n++;
			}
			System.out.println();
		}

	}

}

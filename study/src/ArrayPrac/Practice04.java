package ArrayPrac;

public class Practice04 {

	public static void main(String[] args) {
		
		int[][] num = new int[4][5];
		
		for(int i=0; i<num.length; i++) {
			int min = 1+i;
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = min;
				min += 4;
				System.out.printf("%d ", num[i][j]);
			};
			System.out.println();
		};
	}

}

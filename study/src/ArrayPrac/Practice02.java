package ArrayPrac;

public class Practice02 {

	public static void main(String[] args) {
		
		int[][] num = new int[4][5];
		int i, j, b=1;
		
		for(i=0; i<num.length; i++) {
			num[i] = new int[5];
			for(j=0; j<num[i].length; j++) {
				num[i][j] = b;
				if(i%2!=0) {
					System.out.printf("%d ", (num[i][j]-1));
					b--;
				}else {
					System.out.printf("%d ", num[i][j]);
					b++;
				};
			};
			b += 5;
			System.out.println();
		};

	}

}

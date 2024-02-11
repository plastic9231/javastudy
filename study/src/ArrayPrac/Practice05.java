package ArrayPrac;

public class Practice05 {

	public static void main(String[] args) {
		
		int n[][] = new int[4][];
		int i, j, a=4, b=1;
		
		for(i=0; i<n.length; i++) {
			n[i] = new int[a];
			for(j=0; j<n[i].length; j++) {
				n[i][j] = b;
				System.out.printf("%d ", n[i][j]);
				b++;
			};
			a--;
			System.out.println();
		};

	}

}

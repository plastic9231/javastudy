package ArrayPrac;

public class Practice01 {

	public static void main(String[] args) {
		
		int n[][] = new int[4][];
		int b=1;
		
		for(int i=0; i<n.length; i++) {
			n[i] = new int[i+1];
			for(int j=0; j<n[i].length; j++) {
				n[i][j] = b;
				System.out.printf("%d ", n[i][j]);
				b++;
			};
			System.out.println();
		};

	}

}

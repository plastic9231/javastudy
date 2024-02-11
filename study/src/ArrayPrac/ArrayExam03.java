package ArrayPrac;

public class ArrayExam03 {

	public static void main(String[] args) {
		
		char[] arr1;
		arr1 = new char[26];
		
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[25] = 'Z';
		
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%c ", arr1[i]);
		};
		System.out.println();
		
		char[] arr2 = {'A','B','Z'};
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%c ", arr2[i]);
		};
		System.out.println();
		
		char[] alpha = new char[26];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)('A'+i);
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.printf("%c ", alpha[i]);
		}
	}

}

package ArrayPrac;

public class ArrayExam06 {

	public static void main(String[] args) {
		/*
		//2차원 배열 생성 첫번째 방법
		int[][] arr1 = new int[3][3];	//배열의 크기 : 행*열
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;
		
		//2차원 배열 생성 두번째 방법
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		*/
		//2차원 배열 생성 세번째 방법
		int[][] arr3 = new int[3][3];
		int n = 1;
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3.length; j++) {
				arr3[i][j] = n;
				System.out.printf("%3d", arr3[i][j]);
				n++;
			}
			System.out.println();
		}

	}

}

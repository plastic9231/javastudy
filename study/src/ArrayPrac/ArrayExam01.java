package ArrayPrac;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] arr;			//배열선언
		
		arr = new int[10];	//메모리 할당
		
		int arr2[] = new int[3];	//배열선언 및 메모리 할당
		
		int[] arr3 = {1,2,3,4,5};	//배열선언 및 값 할당
		
		arr2[0] = 1;		//배열에 값 저장
		arr2[1] = 2;		
	  //arr2[2]				//배열에 값을 저장하지 않은 경우, 나머지 배열공간은 0으로 초기화됨
		
		System.out.printf("%d%n", arr2[2]);
		System.out.printf("%d%n", arr2.length);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%d ", arr2[i]);
		}
		
		
		

	}

}

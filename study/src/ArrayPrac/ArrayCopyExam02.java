package ArrayPrac;

public class ArrayCopyExam02 {

	public static void main(String[] args) {
		
		int[] nums = {10, 20, 30, 40, 50};
		int[] copy;
		int temp;
		
		copy = nums;
		
		System.out.println(copy);			//nums의 값이 아니라 주소값만 출력됨
		System.out.println(copy.length);
		
		temp = nums[0];
		System.out.println(temp);
		
		nums[0] = 1000;
		System.out.println(nums[0]);
		
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%3d\t", nums[i]);
		};
		System.out.println();
		
		copy[0] = 2000;
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%3d\t", nums[i]);		//copy값을 수정하면 원본도 수정됨
		};

	}

}

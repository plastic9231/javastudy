package ObjectPrac01;
// 값에 의한 호출(기본형 매개변수)
// 메소드 호출시 기본 자료형의 값을 인자로 전달하는 방식
public class ValueParameter {
	
	public int increase(int n) {// 인자값을 받아서 1개를 증가시켜주는 메소드
		n++;
		return n;
	}
	
	public void increase(int[] n) {
		for(int i =0;i<n.length;i++) {
			n[i]++;
		}
	}

	public static void main(String[] args) {
		
		int val = 100;
		int[] ref = {100, 800, 1000};
		
		ValueParameter vp = new ValueParameter();
		int val2 = vp.increase(val);
		
		System.out.println(val2);
		// 값에 의한 호출(Call by Value)
		vp.increase(ref);
		// 참조에 의한 호출(Call by reference)
		for(int i =0;i<ref.length;i++) {
			System.out.println(ref[i]);
		}
		

	}

}

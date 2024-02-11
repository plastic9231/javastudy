package ExceptionPrac;

public class ExcepEx01 {
	
	class A {
		
	}
	
	public void aa() {
		class B {
			
		}
	}
	
	private int value;
	
	public void setValue(int value) throws Exception {
		if(value<0) {
			throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

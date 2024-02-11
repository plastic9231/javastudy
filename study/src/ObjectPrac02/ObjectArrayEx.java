package ObjectPrac02;

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

public class ObjectArrayEx {

	public static void main(String[] args) {
		
		Tv[] tv = new Tv[3];		//배열의 크기가 3인 객체배열 선언
		
		for(int i=0; i<tv.length; i++) {		//배열의 값 저장
			tv[i] = new Tv();
			tv[i].channel = i+10;
		};
		
		for(int i=0; i<tv.length; i++) {		//값을 출력
			tv[i].channelUp();
			System.out.println(tv[i].channel);
		};
		

	}

}

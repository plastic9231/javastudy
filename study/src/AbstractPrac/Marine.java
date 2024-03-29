package AbstractPrac;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y + "입니다.");
	}

	@Override
	void stop() {
		System.out.println("한번 해병은 항상 대기 중입니다.");
	}

	@Override
	void message() {
		System.out.println("Message : Standing back");
	}
	
	void stemPack() {
		System.out.println("마린이 스팀팩을 사용한다.");
	}
}

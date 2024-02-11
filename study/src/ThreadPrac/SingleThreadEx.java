package ThreadPrac;

/* Thread
 * 1. 멀티테스킹
 * - 프로세스란 운영체제에서 실행중인 하나의 프로그램을 의미
 * - 멀티 프로세스란 두 개 이상의 프로세스가 실행되는 것을 의미
 * - 멀티 테스킹이란 두 개 이상의 프로세스를 실행하여 이를 처리하는 것을 의미
 * 
 * 2. 멀티스레드
 * - 스레드란 프로세스 내에서 실행되는 내부 작업 단위를 의미
 * - 멀티 스레드란 하나의 프로세스에서 여러개의 스레드가 병행적으로 처리되는 것을 의미
 * 
 * 3. 스레드 생명주기
 * - 스레드는 Thread 객체가 생성됨녀 생명 주기를 갖게 되는데 크게 5가지로 분류
 * - New(create) : 스레드가 만들어진 상태를 의미
 * - Runnable : 스레드 객체가 생성된 후에 start() 메소드를 호출하면 runnable 상태로 이동
 * - Running : Runnable 상태에서 스레드 스케줄러에 의해 Running 상태로 이동
 * - Blocked : 스레드가 다른 특정한 이유로 Running 상태에서 Blocked 상태로 이동
 * - Dead : 스레드가 종료됨녀 그 스레드는 다시 시작할 수 없음
 */

public class SingleThreadEx extends Thread {
	
	private int[] temp;
	
	public SingleThreadEx(String threadname) {
		
		super(threadname);
		temp = new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for(int start : temp) {
			try {
				sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s, ", currentThread().getName());
			
			System.out.printf("temp value : %d\n", start);
		}
	}

	public static void main(String[] args) {
		
		SingleThreadEx se = new SingleThreadEx("홍길동");
		se.start();

	}

}

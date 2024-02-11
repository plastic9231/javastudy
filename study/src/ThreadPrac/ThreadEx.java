package ThreadPrac;

/* 스레드의 종류
 * 1. User Thread : main의 종료와 상관없이 thread가 계속 진행된다.
 * 2. Daemon Thread : main의 종료시 thread가 종료됨 - setDaemon(true)
 * 
 * 스레드의 스케줄링 방식
 * 1. 선점형 스레드 스케줄링 방식 : 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 실행시키는 방식
 * 2. 협력형 스레드 스케줄링 방식 : 실행중 스레드가 cpu 사용권을 다른 스레드에게 넘길때 까지 기다리는 방식
 * 
 * 자바의 JVM은 우선순위에 따른 선점형 스레드 스케줄링 방식을 사용한다.
 * 
 * 스레드 스케줄러
 * - 멀티 스레드가 수행될때 어떤 스레드가 먼저 수행될지는 스레드 스케줄러가 결정하게 된다.
 * - 자바에서는 우선수위가 높은 선점형 스레드 스케줄러 방식을 채택
 * 
 * 우선수위 결정 방식
 * 1. 우선수위 결정(1~10)
 * 		- setPriority(MIN_PRIORITY) : 1
 * 		- setPriority(NROM_PRIORITY) : 5
 * 		- setPriority(MAX_PRIORITY) : 10
 * 2. main과의 연관성
 * 		- setDaemon(true/false)
 * 		- 위의 메소드 실행전에 우선순위가 설정되야함.
 */

class ThreadSub extends Thread {
	
	private String name;
	private String lastname;
	
	public ThreadSub(String a, String b, int x) {
		name = a;
		lastname = b;
		setPriority(x);
		setDaemon(true); //main 스레드가 종료한 후에 종료된다.
	}
	
	@Override
	public void run() {
		System.out.println(Thread.activeCount());	//활동중인 메소드의 개수를 확인
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];
		Thread.enumerate(th);
		
		for(int i=0; i<th.length; i++) {
			System.out.println(th[i].getName()+":"+th[i].getPriority()+":"+th[i].isDaemon()+":"+th[i].isAlive());
		}
		
		while(true) {
			System.out.print("이름 : "+name);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("\t 성씨 : "+lastname);
		}
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		
		ThreadSub ts = new ThreadSub("길동", "홍", 1);
		ts.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		ThreadSub ts2 = new ThreadSub("유신", "김", 5);
		ts2.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}

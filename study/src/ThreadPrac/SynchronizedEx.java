package ThreadPrac;

/*
 * 1. 공정 : 여러개의 스레드가 하나의 컴퓨터 자원을 사용하기 위해 동시에 접근하는 프로그램을 작성할 경우 
 * 			 모든 스레드는 공정하게 그 자원을 사용할 수 있도록 해야한다.
 * 
 * 2. 기아 : 하나 또는 그 이상의 스레드가 자원을 얻기 위해 Blocked 상태에 있고, 
 * 			 그 자원을 얻을 수 그 자원을 얻을 수 없게 됨녀 다른 작업을 못하게 하는 상태를 의미한다.
 * 
 * 3. 교착상태 : 두 개의 스레드가 만족하지 못하는 상태로 계속 기다릴 때를 의미한다.
 * 
 * 4. Object 클래스의 wait(), notify(), notifyAll() : 동기화된 스레드는 동기화 블럭에서 다른 스레드에게 제어권을 넘기지 못한다. 이와 같은 동기화 블럭에서 
 * 												  	 스레드간의 통신(제어관)넘기기 위해서는 wait(), notify(), notifyAll() 메소드를 사용해야함
 * 
 * 4-1. 위의 메소드를 사용할 경우 주의사항 : synchronized 블럭에서만 의미가 있음. 만약 synchronized 블럭이 아닌 경우에 사용할 때는
 * 											 java.lang.IllegalMonitorStateException이 발생함
 * 
 * 
 */

class ATM implements Runnable {
	
	private long depositMoney = 10000;
	
	@Override
	public void run() {
		
		synchronized (this) { 	//동기화 블럭
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				
				if(getDEpositMoney() <= 0) {
					break;
				}
				withDraw(1000);
				
				if(getDEpositMoney()==2000 || getDEpositMoney()==4000 || getDEpositMoney()==6000 || getDEpositMoney()==8000) {
					try {
						this.wait(); //실행중이던 스레드는 잠시 기다린다.
					}catch(InterruptedException ie) {
						ie.printStackTrace();
					}
				}else {
					this.notify(); //기다리고 있는 스레드 중 임의의 스레드만 제어권이 있음
				}
			}
		}
	}
	
	public long getDEpositMoney() {
		return depositMoney;
	}
	
	public void withDraw(long houMuch) {
		if(getDEpositMoney() > 0) {
			depositMoney -= houMuch;
			System.out.println(Thread.currentThread().getName()+", ");
			System.out.printf("잔액 : %d원\n", getDEpositMoney());
		}else {
			System.out.println(Thread.currentThread().getName()+", ");
			System.out.println("잔액이 부족합니다.");
		}
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();

	}

}

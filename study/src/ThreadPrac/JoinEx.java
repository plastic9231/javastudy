package ThreadPrac;

class MyRunnableTwo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
}

public class JoinEx {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" start");
		
		Runnable r = new MyRunnableTwo();
		Thread myThread = new Thread(r);
		
		myThread.start();
		
		try {
			myThread.join(); //join() 메소드는 해당 메소드를 호출한 스레드가 종료할 때(myThread)까지 현재 스레드(main)를 기라게 됨
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" end");

	}

}

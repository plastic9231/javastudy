package ThreadPrac;

public class SIngleRunnableEx implements Runnable {
	
	private int[] temp;
	
	public SIngleRunnableEx() {
		temp = new int[10];
		
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}

	@Override
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s, ", Thread.currentThread().getName());
			
			System.out.printf("temp value : %d\n", start);
		}
	}

	public static void main(String[] args) {
		
		SIngleRunnableEx sre = new SIngleRunnableEx();
		Thread t = new Thread(sre,"홍길동");
		t.start();
		
	}

}

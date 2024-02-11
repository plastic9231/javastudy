package ObjectPrac02;

public class MyClassMain {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(20, "홍길동");
		
		System.out.printf("%s, %d%n",mc1.getName(), mc1.getAge());
		System.out.printf("%s, %d",mc2.getName(), mc2.getAge());

	}

}

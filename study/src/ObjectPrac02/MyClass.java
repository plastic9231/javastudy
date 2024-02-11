package ObjectPrac02;

public class MyClass {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public MyClass() {
		name = "무명";		
	}
	
	public MyClass(int a, String n) {
		//생성자 오버로딩 : 객체를 생성할 수 있는 방법의 수를 제공하는 것과 같다.
		//각 생성자를 구별하는 방법은 인자로 구별
		name = n;
		age = a;

	}

}

package OverridePrac;

public class Sub extends Super{
	
	int a = 10;
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}

}

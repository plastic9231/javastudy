package ObjectPrac02;

/*
 * this와 this()
 * this : 특정개체 내에서 자신이 생성되었을때의 주소값 변수. 객체의 수조는 생성 전까지는 모르기 때문에 생성 후 자신의 주소로 배치
 * this() : 현재 객체의 생성자를 의미. 생성자 안에서 오버로딩된 다른 생성자를 호출할 경우 this()라는 키워드로 호출
 */

public class ThisEx {
	
	String name, jumin, tel;
	
	public ThisEx() {	//기본 생성자
		this.name = "Gest";
		this.jumin = "000000-0000000";
		tel = "000-0000-0000";		//this.해도 되고 안해도 되고
	}
	
	public ThisEx(String name) {	//생성자 오버로딩
		this();
		this.name = name;
	}

	public ThisEx(String name, String jumin) {	//생성자 오버로딩
		this(name);
		this.jumin = jumin;
	}
	
	public ThisEx(String name, String jumin, String tel) {	//생성자 오버로딩
		this(name, jumin);
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}
	public String getTel() {
		return tel;
	}
	
}

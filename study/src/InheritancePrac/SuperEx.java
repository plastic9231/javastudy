package InheritancePrac;

public class SuperEx {
	
	private String hak, name;
	private int kor, eng, mat;
	
	public SuperEx() {
		
	}
	
	public SuperEx(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void set(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		//object 클래스의 메소드를 오버라이딩
		if(name==null) {
			return null;
		}
		String str = String.format("%s, 종점 : %d", name, (kor+eng+mat));
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		SuperEx se = null;
		
		if(obj instanceof SuperEx) {
			se = (SuperEx)obj;
		}else {
			return flag;
		};
		
		if(this.name.equals(se.name)&&hak.equals(se.hak)) {
			flag = true;
		}
		
		return flag;			
	}	

}

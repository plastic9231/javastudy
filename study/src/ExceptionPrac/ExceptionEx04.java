package ExceptionPrac;

/*
 * 예외의 강제발생 : throw(throws아님)
 * throw new 발생시킬 예외객체의 생성자/throw 예외객체
 */

interface cc {
	public void dd();
}

public class ExceptionEx04 {

	public static void main(String[] args) {
		
		new cc() {
			@Override
			public void dd() {
				// TODO Auto-generated method stub
				
			}
		};
		
		/*
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		ExcepEx01 ee = new ExcepEx01();
		
		try {
			ee.setValue(-3);
			int y = ee.getValue();
			System.out.println(y);
		}catch(Exception e) {
			System.out.println(e.toString());
		};
	}

}

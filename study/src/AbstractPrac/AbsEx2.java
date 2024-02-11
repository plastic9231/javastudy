package AbstractPrac;

public abstract class AbsEx2 extends AbsEx1 {

		@Override
		public int getA() {
			// 부모클래스의 추상메소드 재정의
			return a;
		}
		
		public abstract String getStr();
		
		
}

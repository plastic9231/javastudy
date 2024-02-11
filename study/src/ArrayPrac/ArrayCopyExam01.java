package ArrayPrac;

/*
 * 배열의 복사
 * 
 * - 배열은 한번 생성된 후 배열의 크기를 변경할 수 없다.
 * - 크기를 조절하려면 같은 자료형의 배열을 원하는 크기로 만든 후, 기존 배열을 복사하면 작업이 완료
 * 
 * - System.arraycopy()메소드를 사용
 * - public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length){}
 * 
 * src : 소스배열(원본배열)
 * srcPos : 원본배열의 복사 시작위치
 * dest : 복사가 될 배열
 * destPos : 복사 시작 위치
 * length : 복사되는 배열의 길이(요소의 수)
*/

public class ArrayCopyExam01 {

	public static void main(String[] args) {
		
		//Java, DataBase, Jsp, Xml
		//Os, NetWork
		String[] src = {"Java", "DataBase", "Jsp", "Xml"};
		String[] des = new String[6];
		des[0] = "Os";
		des[1] = "NetWork";
		
		System.arraycopy(src, 0, des, 2, 4);		
		//복사할 배열, 복사할 배열의 시작위치, 복사한 배열을 박을 배열, 복사내용을 박을  시작위치, 복사할 배열의 길이
		
		for(String str : des) {
			System.out.printf("des값 : %s%n", str);
		};
			
	}

}

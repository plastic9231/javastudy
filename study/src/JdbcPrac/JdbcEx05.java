package JdbcPrac;

/*
 * 	PreparedStatement는 sql의 형태는 동일하나 조건이나 변수값이
 * 	다른 문장을 바인딩변수(?)를 사용해서 변수처리함으로써 항상 동일한
 * 	SQL 문을 동일하게 처리할 수 있다.
 * 
 * 	- PreparedStatement객체의 생성 및 바인딩 변수(?)의 사용
 * 	  바인딩변수는 실제값으로 대체될 부분에 사용하는 변수다.
 * 	  ex)
 * 		String sql = "insert into department values(?,?,?,?)";
 * 		PreparedStatement pstmt = con.prepareStatement(sql);
 * 
 * 	  바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다.
 * 	  pstmt.setInt(1, 203);
 * 	  pstmt.setString(2, "생명공학과");
 * 	  pstmt.setInt(3, 200);
 * 	  pstmt.setString(4, "6호관");
 * 
 * 	  (★★★★★ : 바인딩 변수는 컬럼명에는 절대 사용할 수 없다.)
 * 
 * 	  PreparedStatement는 
 * 	  PreparedStatement의 바인딩변수에 값을 
 * 	  지정해 주는 setXXX() 메소드를 제공함	
 */

import java.sql.*;

public class JdbcEx05 {

	public static void main(String[] args) {
		
		// PreparedStatement 를 사용하는 경우
		/*
		 * 	sql쿼리에서 실제값으로 대체될 부분을 ?로 처리함
		 * 	? : 데이터베이스에서 sql실행시에 실제값으로 대체됨
		 */
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 데이터베이스 연결 끝
			con = ConnUtil.getConnection();
			
			String sql = "insert into professor values(?,?,?,?,?,sysdate,?,?)";
			
			// PreparedStatement 객체 얻어옴
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "겸임교수");
			pstmt.setInt(5, 450); // 급여 --> 600으로 수정 조건은 교수명
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 207);
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다.");
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			// 사용한 자원들은 반드시 반납처리가 완료 되어야한다.
			// stmt, con 을 반드시 닫아 주어야한다.
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
		}
		
	}

}

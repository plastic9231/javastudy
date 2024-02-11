package JdbcPrac;

import java.sql.*;

public class JdbcEx06 {

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
					
					String sql = "update professor set sal=? where name=?";
					
					// PreparedStatement 객체 얻어옴
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, 600);
					pstmt.setString(2, "홍길동");
					
					int i = pstmt.executeUpdate();
					System.out.println(i + "개의 행이 수정되었습니다.");
					
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

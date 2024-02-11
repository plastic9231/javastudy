package JdbcPrac;

/*
 * ResultSet 객체
 * - select 쿼리를 수행한 결과, 얻어진 결과 집합을 추상화한 것이다.
 * - ResultSet은 결과 집합에서 data를 가져올 수 있는 다양한 메소드를 제공한다.
 * 	 (first(), last(), next(), previous(), close())->데이터의 존재여부판단(반환 : boolean)
 * 
 * - 자료형마다 메소드가 제공된다
 * - 반환형이 int일때 : 
 * 1) getInt(int columnindex) : 현재 행에서 컬럼에 해당하는 index값을 반환
 * 2) getInt(String columnName)
 * 
 * - 반환형이 String일때 : 
 * 1) getString(int columnindex) : 현재 행에서 컬럼인덱스에 해당하는 String값을 반환
 * 2) getString(int columnName) : 현재 행에서 컬럼이름에 해당하는 값을 String값을 반환
 * 
 */

import java.sql.*;

public class JdbcEx03 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
	
		try {
			//메모리로 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			stmt = con.createStatement();
			
			//데이터 수정 쿼리문 작성
			String sql = "delete from department";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개의 행이 삭제되었습니다.");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(SQLException ss) {
			ss.printStackTrace();
		}finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException s) {
				s.printStackTrace();
			}
			
			try {
				if(con!=null) {
					stmt.close();
				}
			}catch(SQLException s) {
				s.printStackTrace();
			}
		}

	}

}

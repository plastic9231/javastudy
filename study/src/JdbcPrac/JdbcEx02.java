package JdbcPrac;

import java.sql.*;

public class JdbcEx02 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
	
		try {
			//메모리로 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			stmt = con.createStatement();
			
			//데이터 수정 쿼리문 작성
			String sql = "update department set dname='컴퓨터공학과' where deptno=207";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개의 행이 추가되었습니다.");
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

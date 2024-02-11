package JdbcPrac;

/*
 * jdbc를 이용한 디비 연결방법 순서
 * 1. import java.sql.*;
 * 
 * 2. 특정 Driver(oracle.jdbc.driver.OracleDriver) 검색 : Class.forName("oracle.jdbc.driver.OracleDriver");
 * 
 * 3. 디비 연결 : jdbc:oracle:thin:@localhost:1521:orcl
 * 
 * 4. 쿼리문 작성 : Statement Class(정적)
 * 					Statement stmt = con.createStatement();
 * 					PreparedStatement pstmt = con.prepareStatement(쿼리문);
 * 
 * 5. 정적일때
 * 	  ResultSet re = stmt.executeQuery(쿼리문); 	--> select
 * 	  ResultSet re = stmt.executeUpdate(쿼리문); 	--> insert, update, delete
 * 
 * 	  동적일때
 * 	  ResultSet re = pstmt.executeQuery(쿼리문); 	--> select
 * 	  ResultSet re = pstmt.executeUpdate(쿼리문);	--> insert, update, delete
 * 
 * 6. 사용 후 반드시 연결을 해제 : Close() 메소드 실행
 */

import java.sql.*;
public class JdbcEx01 {

	public static void main(String[] args) {
	
		Connection con = null;
		Statement stmt = null; 
		
		try {
			//jdbc 드라이브 메모리에 로딩
			/*
			 * Connection과 DriverManager
			 * 
			 * 1.Connection 객체
			 * 	- 디비와 연결을 담당하는 객체이다.
			 * 	- Connection 객체를 이용해서 sql(질의어)을 전송, 실행할 수 있는 Statement 객체를 가져오는 역할을 한다.
			 * 
			 * 2.DriverManager 객체(클래스)
			 * - static 메소드인 getConnection() 메소드를 이용해서 디비와 연결해서 Connection 객체를 반환하는 역할을 한다.
			 * - getConnection(String url, String user, String pasword)
			 * 
			 * ex)	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			 * 		String user = "scott";
			 * 		String password = "tiger";
			 */
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			//System.out.println("데이터베이스 연결 성공");
			
			stmt = con.createStatement(); //실행시킨 쿼리문을 디비로 보내주는 역할
			
			//쿼리문 작성a
			String sql = "insert into department values(207,'제어계측공학과',200,'7호관')";
			//쿼리문 실행
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개의 행이 추가되었습니다.");
		}catch(ClassNotFoundException cncf) {
			cncf.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			//사용한 자원들은 반드시 반납처리가 완료되어야한다.
			//stmt, con을 반드시 닫아줘야한다.
			try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
			
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
		}
	}

}

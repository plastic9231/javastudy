package JdbcPrac;

/*
 * 	ResultSet
 * 
 * 	select 쿼리의 수행결과 얻어진 결과 집합을 추상화한 것이다.
 * 	ResultSet은 결과 집합에서 data를 가져올 수 있는
 * 	다양한 메소드를 제공한다.
 * 		first(), last(), next(), previous() 
 * 		--> 데이터의 존재 여부를 판정 (반환 : boolean)
 * 		
 * 	자료형마다 메소드가 제공된다.
 * 	
 * 	반환형이 int
 * 		getInt(int columnindex)
 * 			- 현재 행에서 컬럼(열)에 해당하는 index값을 반환
 * 		getInt(String columnName)	
 * 
 * 
 * 		String
 * 			getString (int columnindex)
 * 			- 현재 행에서 컬럼 인덱스에 해당 String 값을 반환함 
 * 			getString (String columnName)
 * 			- 현재 행에서 컬럼이름에 해당하는 값을 String 으로 반환함
 * 
 * 
 */

import java.sql.*;

public class JdbcEx04 {

	public static void main(String[] args) {
	
		Connection con = null;
		Statement stmt = null;
		
		// ResultSet 객체는 select(검색, 조회)할때 쿼리의 수행결과를
		// 저장한 결과집합체이다.
		// 데이터를 검색하려면 메소드를 이용하여 검색한다.
		ResultSet rs = null;
		
		try {
			// 메모리로 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			stmt = con.createStatement();
			// 데이터 삭제 쿼리문 작성
			// 학과 테이블에서 컴퓨터공학과에 대한 데이터를 삭제하시오.
			String sql = "select deptno,dname,college, loc from department";
			/*
			 * 	실행하고자 하는 쿼리문이 select인 경우 쿼리실행의 결과집합을 리턴받아
			 * 	저장(executeQuery()메소드를 사용한다.)
			 */
			rs = stmt.executeQuery(sql);
			/*
			 * 	rs 객체로 부터 데이터 추출하기 위해서는 메소드를 이용한다.
			 * 	next() 메소드를 이용하여 다음행으로 이동하여 행이 존재하면
			 * 	true, 존재하지 안흥면 false를 리턴함
			 * 
			 * 	rs.next() ==> 참인경우 행이 존재하는 동안에 데이터 추출함
			 */
				while(rs.next()) {
				// 커서가 위치한 행의 각각의 컬럼에서 값을 추출함
				// rs객체의 getXXX(컬럼위치), getXXX(컬럼이름)
				// 위이 get()메소드를 사용해서 컬럼의 값을 추출함
					int i = rs.getInt(1);
					String s1 = rs.getString(2);
					int j = rs.getInt("college");
					String s2 = rs.getString("loc");
					
					System.out.println(i+ "\t" + s1 + "\t" + j + "\t" + s2);
				}

		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if(rs != null) {
					rs.close();
				}
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
		}
		
	}

}

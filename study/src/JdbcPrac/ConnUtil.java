package JdbcPrac;
// Driver 를 제공해주는 클래스

import java.sql.*;

public class ConnUtil {

	static {
		
		try {
			// 메모리로 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) { 
			cnfe.printStackTrace();
			}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	}
	
	
}

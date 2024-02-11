package JdbcPrac;

/* ResultSetMetaData
 * - ResultSet을 구성하는 모든 요소를 알아낼 수 있는 메소드이다.
 */

import java.io.*;
import java.sql.*;

public class JdbcEx09 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("sql 입력 : ");
		String sql = br.readLine();
		
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		//쿼리 수행 결과집합(rs)의 부가정보를 가지고 있는 ResultSetMetaData 객체를 얻음
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("컬럼의 개수 : "+rsmd.getColumnCount());
		
		int colCnt = rsmd.getColumnCount();
		
		while(rs.next()) {
			for(int colNum=1; colNum<=colCnt; colNum++) {
				
				int colTyp = rsmd.getColumnType(colNum);
				
				switch(colTyp) {
				case Types.NUMERIC : System.out.print(rs.getInt(colNum)+"\t"); break;
				case Types.VARCHAR : System.out.print(rs.getString(colNum)+"\t"); break;
				case Types.DATE : System.out.print(rs.getDate(colNum)+"\t"); break;
				default : break;
				}
			}
			System.out.println();
		}
		
		br.close();
		rs.close();
		pstmt.close();
		con.close();
		
	}

}

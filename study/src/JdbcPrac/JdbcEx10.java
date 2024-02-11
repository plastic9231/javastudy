package JdbcPrac;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx10 {

	public static void main(String[] args) throws Exception {
		
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
			//department.properties에 정의된 sql의 키값을 불러와서 쿼리문을 실행, 전송

			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 추가되었습니다.");
			
		}catch(SQLException ss) {
			ss.printStackTrace();
		}finally {
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

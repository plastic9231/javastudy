package JdbcPrac;

import java.sql.*;

public class JdbcEx07 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnUtil.getConnection();
			//쿼리문 작성
			String sql = "select a.name, a.profno, a.position, b.dname from professor a, department b where a.deptno=b.deptno and a.deptno=?";
			//쿼리문 실행 및 전송
			pstmt = con.prepareStatement(sql);
			//바인딩 변수 처리
			pstmt.setInt(1, 207);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("profno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("position")+"\t");
			}
			
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
				if(pstmt != null) {
					pstmt.close();
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

package JdbcPrac;

/*Transaction(트랜잭션)
 * - 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것
 * - 하나의 작업 단위 내의 전체작업들이 모두 올바르게 수행되거나, 전체작업이 모두 수행되지 않도록 하는 것을 의미
 * 
 * commit(), rollback(), setAutoCommit(true/false)
 */

import java.sql.*;

public class JdbcEx08 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//학과 추가
		String sql1 = "insert into department values(?,?,?,?)";
		//학과 이름, 위치 수정
		String sql2 = "update department set dname=?, loc=? where deptno=?";
		
		try {
			//트랜잭션 작업 시작
			con = ConnUtil.getConnection();
			//setAutoCommit() 기능 비활성화
			con.setAutoCommit(false);
			//첫번째 작업 시작
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			//첫번째 작업 종료
			
			//두번째 작업 시작
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			//두번쨰 작업 종료
			con.commit();
			System.out.println("DB에 반영완료");
			
		}catch(SQLException se) {
			try {
				con.rollback();
				System.out.println("DB에 반영취소");
			}catch(SQLException ss) {
				ss.printStackTrace();
			}
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

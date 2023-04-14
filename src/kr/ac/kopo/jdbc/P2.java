package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.JDBCClose;

public class P2 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "update t_test set name = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "강개똥" );
			pstmt.setString(2, "kang");
			
		
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 수정...");
			
			sql = "SELECT *"
					+ "  FROM T_TEST"
					+ " ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
	    	while(rs.next()) {
	    		String id = rs.getString("id");
	    		String name = rs.getString("name");
	    		System.out.println(id + "(" + name + ")");
	    	}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}

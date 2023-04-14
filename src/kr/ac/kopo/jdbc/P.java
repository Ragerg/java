package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.JDBCClose;

public class P {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT TO_CHAR(HIRE_DATE,'MM') AS HIRE_MONTH"
					+ "      ,COUNT(*)"
					+ "  FROM EMPLOYEES"
					+ " GROUP BY TO_CHAR(HIRE_DATE,'MM')"
					+ " ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.print("HIRE_MONTH\t");
			System.out.println("HIRE_CNT");
			
	    	while(rs.next()) {
	    		String a = rs.getString("hire_month");
	    		String b = rs.getString("count(*)");
	    		System.out.print(a + "\t\t");
	    		System.out.println(b);
	    		
	    	}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}

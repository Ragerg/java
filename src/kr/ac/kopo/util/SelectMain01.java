package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
	    try {
	    	
	    	//1,2단계
	    	conn = new ConnectionFactory().getConnection();
	    	
	    	//3단계
	    	String sql = "select * from t_test";
	    	pstmt = conn.prepareStatement(sql);
	    	
	    	//4단계
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

package com.interior.expert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.interior.page.SearchRow;
import com.interior.util.DBConnector;

public class ExpertDAO {
	
	public int getNum() throws Exception{
		int result = 0;
		
		Connection con = DBConnector.getConnect();
		
		String sql = "select expert_seq.nextval from dual";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		result = rs.getInt(1);
		
		rs.close();
		st.close();
		con.close();
		
		return result;
	}
	
	public int getTotalCount(SearchRow searchRow, Connection con) {
		int result = 0;
		
		String sql = "select count(num) from expert_main where " + searchRow.getSearch().getKind() + " like ?"
	}
	
}

package com.interior.upload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UploadDAO {
	
	public int insert(UploadDTO uploadDTO, Connection con) throws Exception {
		int result = 0;
	
		if(uploadDTO.equals("expert")) {
		String sql = "insert into upload values(upload_seq.nextval,?,?,?,null,null,null,null,?,null,null)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, uploadDTO.getNum());
		st.setString(2, uploadDTO.getOname());
		st.setString(3, uploadDTO.getFname());
		st.setString(4, uploadDTO.getCategory());
		
		result = st.executeUpdate();
		
		st.close();
		}
		
		return result;
	}
	
	public int delete(int pnum, Connection con) throws Exception{
		int result = 0;
		
		String sql = "delete upload where pnum=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, pnum);
		
		result = st.executeUpdate();
		
		st.close();
		
		return result;
	}
	
	public List<UploadDTO> selectList(int num, Connection con) throws Exception{
		List<UploadDTO> ar = new ArrayList<UploadDTO>();
		
		String sql = "select * from upload where num = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, num);
		
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			UploadDTO uploadDTO = new UploadDTO();
			uploadDTO.setPnum(rs.getInt("pnum"));
			uploadDTO.setNum(rs.getInt("num"));
			uploadDTO.setOname(rs.getString("oname"));
			uploadDTO.setFname(rs.getString("fname"));
			ar.add(uploadDTO);
		}
		
		rs.close();
		st.close();
		
		return ar;
	}
	
}
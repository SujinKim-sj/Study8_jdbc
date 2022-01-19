package com.java.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java.s1.util.DBConnector;

public class LocationDAO {

	private DBConnector dbConnector;
	
	public LocationDAO() {
		dbConnector = new DBConnector();
	}
	
	public List<LocationDTO> getList() throws Exception{
		ArrayList<LocationDTO> ar = new ArrayList<>();
		
		//1. DB에 로그인
		Connection con = dbConnector.getConnect();
		
		//2. Sql Query문 작성
		String sql = "SELECT * FROM LOCATIONS";
		
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 세팅 통과
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			
			locationDTO.setLocation_id(rs.getInt("location_id"));
			locationDTO.setStreet_address(rs.getString("street_address"));
			locationDTO.setPostal_code(rs.getString("postal_code"));
			locationDTO.setCity(rs.getString("city"));
			locationDTO.setState_province(rs.getString("state_province"));
			locationDTO.setCountry_id(rs.getString("country_id"));
			
			ar.add(locationDTO);
		}
		
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
		
		
		return ar;
		
	}
}

package com.java.s1.region;

public class RegionTest {

	public static void main(String[] args) {
		// Region Package 내에 있는 것만 Test
		
		RegionDAO regionDAO = new RegionDAO();
		RegionDTO regionDTO = new RegionDTO();
		
		regionDTO.setRegion_id(5L);
		regionDTO.setRegion_name("South Pole");
		
		try {
			//insert Test
			//int result = regionDAO.setInsert(regionDTO);
			//System.out.println(result);

			//delete Test
			//int result = regionDAO.setDelete(regionDTO);
			//System.out.println(result);
			
			//update Test
			int result = regionDAO.setUpdate(regionDTO);
			System.out.println(result);

			if(result > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

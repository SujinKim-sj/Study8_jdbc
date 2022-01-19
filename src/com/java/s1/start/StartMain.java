package com.java.s1.start;

import java.util.List;

import com.java.s1.department.DepartmentDAO;
import com.java.s1.department.DepartmentDTO;
import com.java.s1.department.DepartmentView;
import com.java.s1.location.LocationDAO;
import com.java.s1.location.LocationDTO;
import com.java.s1.location.LocationView;
import com.java.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
	
		//DBConnector dbConnector = new DBConnector();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentView departmentView = new DepartmentView();
		
		LocationDAO locationDAO = new LocationDAO();
		LocationView locationView = new LocationView();
		
		try {
			//dbConnector.getConnect();
			//List<DepartmentDTO> ar = departmentDAO.getList();
			//departmentView.view(ar);
			
			List<LocationDTO> ar = locationDAO.getList();
			locationView.view(ar);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("DB 연동 테스트 끝");
	}

}

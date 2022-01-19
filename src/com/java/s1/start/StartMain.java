package com.java.s1.start;

import java.util.List;

import com.java.s1.department.DepartmentDAO;
import com.java.s1.department.DepartmentDTO;
import com.java.s1.department.DepartmentView;
import com.java.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
	
		//DBConnector dbConnector = new DBConnector();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentView departmentView = new DepartmentView();
		
		try {
			//dbConnector.getConnect();
			List<DepartmentDTO> ar = departmentDAO.getList();
			departmentView.view(ar);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("DB 연동 테스트 끝");
	}

}

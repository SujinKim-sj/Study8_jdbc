package com.java.s1.department;

import java.util.List;
import java.util.Scanner;

public class DepartmentController {

	private DepartmentDAO departmentDAO;
	private DepartmentView departmentView;
	private Scanner sc;
	
	public DepartmentController() {

		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
		sc = new Scanner(System.in);
	
	}
	
	public void start() throws Exception {
	
		boolean flag = true;
		while(flag) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 번호 검색");
			System.out.println("3. 부서 정보 추가");
			System.out.println("4. 부서 정보 삭제");
			System.out.println("5. 나 가 기");
			int select = sc.nextInt();
			DepartmentDTO departmentDTO = null;
			int result = 0;
			String message = null;
			
			switch (select) {
			case 1: 
				List<DepartmentDTO> ar = departmentDAO.getList();
				departmentView.view(ar);
				break;
			
			case 2:
				System.out.println("검색할 부서 번호 입력");
				departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_id(sc.nextInt());
				departmentDTO = departmentDAO.getOne(departmentDTO);
				departmentView.view(departmentDTO);
				if(departmentDTO == null) {
					System.out.println("존재하지 않는 번호입니다");
				}
				break;
			case 3:
				departmentDTO = new DepartmentDTO();
				System.out.println("부서 이름 입력");
				departmentDTO.setDepartment_name(sc.next());
				System.out.println("부서 매니저 ID 입력");
				departmentDTO.setManager_id(sc.nextInt());
				System.out.println("부서 지역 ID 입력");
				departmentDTO.setLocation_id(sc.nextInt());
				
				result = departmentDAO.setInsert(departmentDTO);
				message = "Department Insert Fail";
				
				if(result > 0) {
					message = "Department Insert Success";
					System.out.println(message);
				}
				break;
			case 4:
				departmentDTO = new DepartmentDTO();
				System.out.println("삭제할 부서 ID 입력");
				departmentDTO.setDepartment_id(sc.nextInt());
				
				result = departmentDAO.setDelete(departmentDTO);
				message = "Department Delete Fail";
				
				if(result > 0) {
					message = "Department Delete Success";
					System.out.println(message);
				}
				break;
			default:
				flag = false;
			
			}
		}
	}
}

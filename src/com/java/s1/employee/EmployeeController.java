package com.java.s1.employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
	private EmployeeDAO employeeDAO;
	private EmployeeView employeeView;
	private Scanner sc;
	
	public EmployeeController() {
		sc = new Scanner(System.in);
		employeeDAO = new EmployeeDAO();
		employeeView = new EmployeeView();
	}
	
	public void start() throws Exception{
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 직원 리스트 출력");
			System.out.println("2. 직원 번호 검색");
			System.out.println("3. 나 가 기");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				List<EmployeeDTO> ar = employeeDAO.getList();
				employeeView.view(ar);
				break;
			case 2:
				System.out.println("검색할 직원 번호 입력");
				EmployeeDTO employeeDTO = new EmployeeDTO();
				employeeDTO.setEmployee_id(sc.nextInt());
				employeeDTO = employeeDAO.getOne(employeeDTO);
				employeeView.view(employeeDTO);
				
				if(employeeDTO == null) {
					System.out.println("존재하지 않는 번호입니다");
				}
				break;
			default:
				flag = false;
			}
			
			
		}
	}
	
}

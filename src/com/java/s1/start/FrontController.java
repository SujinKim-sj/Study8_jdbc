package com.java.s1.start;

import java.util.Scanner;

import com.java.s1.department.DepartmentController;

public class FrontController {

	private Scanner sc;
	private DepartmentController departmentController;
	//LocationController
	//EmployeeController
	
	public FrontController() {
		sc = new Scanner(System.in);
		departmentController = new DepartmentController();
		//LocationController
		//EmployeeController
	}
	
	public void mainStart() throws Exception {
		boolean flag = true;
		while(flag) {
			System.out.println("1. 직 원  관 리");
			System.out.println("2. 부 서  관 리");
			System.out.println("3. 지 역  관 리");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				//EmployeeController의 start 메서드 호출
				break;
			case 2: 
				departmentController.start();
				break;
			case 3:
				//LocationController의 start 메서드 호출
				break;
			default:
				flag = false;
			}
		}
		
	}
}

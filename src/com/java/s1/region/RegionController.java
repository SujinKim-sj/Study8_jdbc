package com.java.s1.region;

import java.util.Scanner;

public class RegionController {

	private RegionInput regionInput;
	private RegionDAO regionDAO;
	private RegionView regionView;
	private Scanner sc;
	
	public RegionController () {
		regionInput = new RegionInput();
		regionDAO = new RegionDAO();
		regionView = new RegionView();
		sc = new Scanner(System.in);
	}

	public void start() throws Exception {
		boolean check = true;
		
		while (check) {
			System.out.println("1. Region 추가");
			System.out.println("2. Region 수정");
			System.out.println("3. Region 삭제");
			System.out.println("4. 종       료");
			
			int select = sc.nextInt();
			RegionDTO regionDTO = null;
			int result = 0;
			String message = null;
			
			switch (select) {
			case 1:
				regionDTO = regionInput.setInsert();
				result = regionDAO.setInsert(regionDTO);
				message = "Fail";
				
				if(result > 0) {
					message = "Success";
				}
			
				regionView.view(message);
				break;
			case 2:
				regionDTO = regionInput.setInsert();
				result = regionDAO.setUpdate(regionDTO);
				message = "Update Fail";
				
				if(result > 0) {
					message = "Update Success";
				}
				regionView.view(message);
				break;
			case 3:
				regionDTO = regionInput.setDelete();
				result = regionDAO.setDelete(regionDTO);
				message = "Delete Fail";
				
				if(result > 0) {
					message = "Delete Success";
				}
				regionView.view(message);
				break;
			default:
				check = false;
			
			}
		}
	}
	
}

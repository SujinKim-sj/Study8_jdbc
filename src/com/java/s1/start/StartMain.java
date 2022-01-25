package com.java.s1.start;

import com.java.s1.region.RegionController;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
	
		FrontController frontController = new FrontController();
		//RegionController regionController = new RegionController();
		
		try {
			frontController.mainStart();
			//regionController.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DB 연동 테스트 끝");
	}

}

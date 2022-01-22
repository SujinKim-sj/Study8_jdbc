package com.java.s1.start;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("DB 연동 테스트 시작");
	
		FrontController frontController = new FrontController();
		
		try {
			frontController.mainStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DB 연동 테스트 끝");
	}

}

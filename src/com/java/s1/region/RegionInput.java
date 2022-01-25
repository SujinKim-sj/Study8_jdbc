package com.java.s1.region;

import java.util.Scanner;

public class RegionInput {

	private Scanner sc;
	
	public RegionInput() {
		sc = new Scanner(System.in);
	}
	
	//delete
	public RegionDTO setDelete() {
		RegionDTO regionDTO = new RegionDTO();
		
		System.out.println("Region ID를 입력");
		regionDTO.setRegion_id(sc.nextLong());
		
		return regionDTO;
		
	}
	
	//insert
	public RegionDTO setInsert() {
		RegionDTO regionDTO = new RegionDTO();
		
		System.out.println("Region ID를 입력");
		regionDTO.setRegion_id(sc.nextLong());
		
		System.out.println("Region Name을 입력");
		regionDTO.setRegion_name(sc.next());
		
		return regionDTO;
	}
	
}

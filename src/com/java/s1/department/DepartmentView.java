package com.java.s1.department;

import java.util.List;

public class DepartmentView {
	
	public void view(DepartmentDTO departmentDTO) {
		System.out.print(departmentDTO.getDepartment_id() + "\t");
		System.out.print(departmentDTO.getDepartment_name() + "\t");
		System.out.print(departmentDTO.getManager_id() + "\t");
		System.out.println(departmentDTO.getLocation_id());
		System.out.println("--------------------------------------------------");
	}

	public void view(List<DepartmentDTO> ar) {
		//모두 출력
		for(int i = 0; i < ar.size(); i++) {
			this.view(ar.get(i));
		}
	}
}

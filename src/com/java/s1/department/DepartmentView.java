package com.java.s1.department;

import java.util.List;

public class DepartmentView {

	public void view(List<DepartmentDTO> ar) {
		//모두 출력
		for(int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i).getDepartment_id() + "\t");
			System.out.print(ar.get(i).getDepartment_name() + "\t");
			System.out.print(ar.get(i).getManager_id() + "\t");
			System.out.println(ar.get(i).getLocation_id());
			System.out.println("--------------------------------------------------");
		}
	}
}

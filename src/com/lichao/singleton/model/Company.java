package com.lichao.singleton.model;

import java.util.ArrayList;
import java.util.List;

/**
 * ��˾��
 * @author LiChao
 *
 */
public class Company {
	private List<Staff> allStaffs = new ArrayList<Staff>();
	
	public void addStaff(Staff per) {
		allStaffs.add(per);
	}
	
	public void showAllStaffs() {
		for (Staff per : allStaffs) {
			System.out.println("Obj : " + per.toString());
		}
	}
}

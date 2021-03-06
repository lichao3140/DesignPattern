package com.lichao.singleton.model;

public class Client {
	
	public static void main(String[] args) {
		Company cp = new Company();
		//CEO只能通过getCeo函数获取
		Staff ceo1 = CEO.getCeo();
		Staff ceo2 = CEO.getCeo();
		cp.addStaff(ceo1);
		cp.addStaff(ceo2);
		
		//通过 new 创建VP对象
		Staff vp1 = new VP();
		Staff vp2 = new VP();
		
		//通过 new 创建staff对象
		Staff staff1 = new Staff();
		Staff staff2 = new Staff();
		Staff staff3 = new Staff();
		
		cp.addStaff(vp1);
		cp.addStaff(vp2);
		cp.addStaff(staff1);
		cp.addStaff(staff2);
		cp.addStaff(staff3);
		
		cp.showAllStaffs();
	}
}

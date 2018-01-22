package com.lichao.visitor.model;

import java.util.LinkedList;
import java.util.List;

/**
 * 员工业务报表
 * @author LiChao
 *
 */
public class BusinessReport {
	List<Staff> mStraffs = new LinkedList<Staff>();
	
	public BusinessReport() {
		mStraffs.add(new Manager("王经理"));
		mStraffs.add(new Engineer("工程师-1"));
		mStraffs.add(new Engineer("工程师-2"));
		mStraffs.add(new Engineer("工程师-3"));
		mStraffs.add(new Engineer("工程师-4"));
	}
	
	/**
	 * 为访客者展示报表
	 * @param visitor  公司高层CEO CTO
	 */
	public void showReport(Visitor visitor) {
		for (Staff staff : mStraffs) {
			staff.accept(visitor);
		}
	}
}

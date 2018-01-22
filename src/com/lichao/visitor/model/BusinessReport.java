package com.lichao.visitor.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Ա��ҵ�񱨱�
 * @author LiChao
 *
 */
public class BusinessReport {
	List<Staff> mStraffs = new LinkedList<Staff>();
	
	public BusinessReport() {
		mStraffs.add(new Manager("������"));
		mStraffs.add(new Engineer("����ʦ-1"));
		mStraffs.add(new Engineer("����ʦ-2"));
		mStraffs.add(new Engineer("����ʦ-3"));
		mStraffs.add(new Engineer("����ʦ-4"));
	}
	
	/**
	 * Ϊ�ÿ���չʾ����
	 * @param visitor  ��˾�߲�CEO CTO
	 */
	public void showReport(Visitor visitor) {
		for (Staff staff : mStraffs) {
			staff.accept(visitor);
		}
	}
}

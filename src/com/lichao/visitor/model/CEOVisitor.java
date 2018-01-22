package com.lichao.visitor.model;

/**
 * CEO�ÿ��ߣ�ֻ��עҵ��
 * @author LiChao
 *
 */
public class CEOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("����ʦ:" + engineer.name + " KPI:" + engineer.kpi);
	}

	@Override
	public void visit(Manager leader) {
		System.out.println("����:" + leader.name + " KPI:" + leader.kpi + " �²�Ʒ����:" + leader.getProducts());
	}
	
	class ReportUtil {
		public void visit(Staff staff) {
			if (staff instanceof Manager) {
				Manager mgr = (Manager) staff;
				System.out.println("����:" + mgr.name + " KPI" + mgr.kpi + " �²�Ʒ����:" + mgr.getProducts());
			} else {
				Engineer engineer = (Engineer) staff;
				System.out.println("����ʦ:" + engineer.name + " KPI:" + engineer.kpi);
			}
		}
	}
	
}

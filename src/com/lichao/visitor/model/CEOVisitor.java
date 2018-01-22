package com.lichao.visitor.model;

/**
 * CEO访客者，只关注业绩
 * @author LiChao
 *
 */
public class CEOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师:" + engineer.name + " KPI:" + engineer.kpi);
	}

	@Override
	public void visit(Manager leader) {
		System.out.println("经理:" + leader.name + " KPI:" + leader.kpi + " 新产品数量:" + leader.getProducts());
	}
	
	class ReportUtil {
		public void visit(Staff staff) {
			if (staff instanceof Manager) {
				Manager mgr = (Manager) staff;
				System.out.println("经理:" + mgr.name + " KPI" + mgr.kpi + " 新产品数量:" + mgr.getProducts());
			} else {
				Engineer engineer = (Engineer) staff;
				System.out.println("工程师:" + engineer.name + " KPI:" + engineer.kpi);
			}
		}
	}
	
}

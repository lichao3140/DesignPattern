package com.lichao.subject.demo2;

public class ProxyClass implements Buy_Car {
	private People people;
	
	public People getPeople() {
		return people;
	}
	
    public void setPeople(People people) {
    	this.people = people;
    }

	@Override
	public void buy_mycar() {
		if (people.getVip() == "vip") {
			people.buy_mycar();
			return;
		}
		
		if(people.getCash() >= 50000) {
			System.out.println(people.getUsername() + "�����³������׽�����");
		} else {
			System.out.println(people.getUsername() + "Ǯ�����������򳵣�����������");
		}
	}

}

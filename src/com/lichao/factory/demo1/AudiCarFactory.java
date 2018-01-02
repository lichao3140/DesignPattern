package com.lichao.factory.demo1;

public class AudiCarFactory extends AudiFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends AudiCar> T createAudiCar(Class<T> clz) {
		AudiCar car = null;
		try {
			car = (AudiCar) Class.forName(clz.getName()).newInstance();
		} catch (Exception  e) {
			e.printStackTrace();
		}
		return (T) car;
	}

}

package com.lichao.abstractfactory.demo1;

/**
 * Q3π§≥ß¿‡
 * @author LiChao
 *
 */
public class Q3Factory extends CarFactory {

	@Override
	public ITire createTire() {
		return new NormalTire();
	}

	@Override
	public IEngine createEngine() {
		return new DomesticEngine();
	}

	@Override
	public IBrake createBrake() {
		return new NormalBrake();
	}

}

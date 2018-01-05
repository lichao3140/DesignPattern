package com.lichao.abstractfactory.demo1;

/**
 * Q7������
 * @author LiChao
 *
 */
public class Q7Factory extends CarFactory {

	@Override
	public ITire createTire() {
		return new SUVTire();
	}

	@Override
	public IEngine createEngine() {
		return new ImportEngine();
	}

	@Override
	public IBrake createBrake() {
		return new SeniorBrake();
	}

}

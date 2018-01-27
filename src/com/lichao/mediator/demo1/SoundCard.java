package com.lichao.mediator.demo1;

/**
 * Éù¿¨Í¬ÊÂ
 * @author LiChao
 *
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * ÒôÆµ²¥·Å
	 * @param data
	 */
	public void soundPlay(String data) {
		System.out.println("ÒôÆµ£º" + data);
	}
}

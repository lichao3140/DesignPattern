package com.lichao.mediator.demo1;

/**
 * 显卡同事
 * @author LiChao
 *
 */
public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 视频播放
	 * @param data
	 */
	public void videoPlay(String data) {
		System.out.println("视频：" + data);
	}
}

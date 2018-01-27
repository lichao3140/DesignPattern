package com.lichao.mediator.demo1;

/**
 * CPU同事
 * @author LiChao
 *
 */
public class CPU extends Colleague {
	private String dataSound;//音频数据
	private String dataVideo;//视频数据

	public CPU(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 获取音频数据
	 * @return
	 */
	public String getDataSound() {
		return dataSound;
	}

	/**
	 * 获取视频数据
	 * @return
	 */
	public String getDataVideo() {
		return dataVideo;
	}
	
	/**
	 * 解码数据
	 * @param data
	 */
	public void decodeData(String data) {
		//分割音视频数据
		String[] temp = data.split(",");
		
		//解析音视频数据
		dataVideo = temp[0];
		dataSound = temp[1];
		
		//告诉中介者自身状态改变
		mediator.changed(this);
	}

}

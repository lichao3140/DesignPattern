package com.lichao.mediator.demo1;

/**
 * 光驱同事
 * @author LiChao
 *
 */
public class CDDevice extends Colleague {
	private String data;//视频数据

	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 读取视频数据
	 * @return
	 */
	public String read() {
		return data;
	}
	
	/**
	 * 加载视频数据
	 */
	public void load() {
		//实际情况中视频数据与音频数据多在一个数据流中
		data = "视频数据,音频数据";
		
		//通知中介者   也就是主板数据改变
		mediator.changed(this);
	}
}

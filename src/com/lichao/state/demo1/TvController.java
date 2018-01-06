package com.lichao.state.demo1;

/**
 * 电视遥控器
 * @author LiChao
 *
 */
public class TvController implements PowerController {
	TvState mTvState;
	
	public void setTvState(TvState mTvState) {
		this.mTvState = mTvState;
	}

	@Override
	public void powerOn() {
		// 开机
		setTvState(new PowerOnState());
		System.out.println("开机啦");
	}

	@Override
	public void powerOff() {
		// 关机
		setTvState(new PowerOffState());
		System.out.println("关机啦");
	}
	
	public void nextChannel() {
		mTvState.nextChannel();
	}
	
	public void prevChannel() {
		mTvState.prevChannel();
	}
	
	public void turnUp() {
		mTvState.turnUp();
	}
	
	public void trunDowm() {
		mTvState.turnDown();
	}

}

package com.lichao.state.demo1;

/**
 * ����ң����
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
		// ����
		setTvState(new PowerOnState());
		System.out.println("������");
	}

	@Override
	public void powerOff() {
		// �ػ�
		setTvState(new PowerOffState());
		System.out.println("�ػ���");
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

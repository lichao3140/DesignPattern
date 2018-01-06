package com.lichao.state.demo1;

public class Clinent {
	public static void main(String[] args) {
		TvController tvController = new TvController();
		//设置开机状态
		tvController.powerOn();
		//下一频道
		tvController.nextChannel();
		//调高音量
		tvController.turnUp();
		//设置关机状态
		tvController.powerOff();
		//调高音量,此时不会有效
		tvController.turnUp();
	}
}

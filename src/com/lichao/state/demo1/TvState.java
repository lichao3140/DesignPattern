package com.lichao.state.demo1;

/**
 * 电视状态接口，定义了电视操作的函数
 * @author LiChao
 *
 */
public interface TvState {
	/**
	 * 下一频道
	 */
	public void nextChannel();
	/**
	 * 上一频道
	 */
	public void prevChannel();
	/**
	 * 加音量
	 */
	public void turnUp();
	/**
	 * 减音量
	 */
	public void turnDown();
}

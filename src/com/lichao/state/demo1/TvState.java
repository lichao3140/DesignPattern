package com.lichao.state.demo1;

/**
 * ����״̬�ӿڣ������˵��Ӳ����ĺ���
 * @author LiChao
 *
 */
public interface TvState {
	/**
	 * ��һƵ��
	 */
	public void nextChannel();
	/**
	 * ��һƵ��
	 */
	public void prevChannel();
	/**
	 * ������
	 */
	public void turnUp();
	/**
	 * ������
	 */
	public void turnDown();
}

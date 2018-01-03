package com.lichao.singleton.model;

/**
 * CEO, ��������ģʽ
 * @author LiChao
 *
 */
public class CEO extends Staff {
	private static final CEO mCeo = new CEO();
	
	//�������к���
	private CEO() {
		
	}
	
	//���еľ�̬���������Ⱪ¶��ȡ��������Ľӿ�
	public static CEO getCeo() {
		return mCeo;
	}
	
	@Override
	public void work() {
		//����VP
	}

}

package com.lichao.singleton.model;

/**
 * CEO, 饿汉单例模式
 * @author LiChao
 *
 */
public class CEO extends Staff {
	private static final CEO mCeo = new CEO();
	
	//构造是有函数
	private CEO() {
		
	}
	
	//公有的静态函数，对外暴露获取单例对象的接口
	public static CEO getCeo() {
		return mCeo;
	}
	
	@Override
	public void work() {
		//管理VP
	}

}

package com.lichao.memoto.demo1;

/**
 * 负责管理 Memoto
 * @author LiChao
 *
 */
public class Caretaker {
	//备忘录
	Memoto mMemoto;
	
	/**
	 * 存档
	 */
	public void archive(Memoto memoto) {
		this.mMemoto = memoto;
	}
	
	/**
	 * 获取存档
	 * @return
	 */
	public Memoto getMemoto() {
		return mMemoto;
	}
}

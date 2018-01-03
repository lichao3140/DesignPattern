package com.lichao.builder.demo1;

/**
 * 负责构造Computer
 * @author LiChao
 *
 */
public class Director {
	Builder mBuilder = null;
	
	public Director(Builder builder) {
		mBuilder = builder;
	}

	/**
	 * 构建对象
	 * @param board
	 * @param display
	 */
	public void construct(String board, String display) {
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
	
}

package com.lichao.builder.demo1;

/**
 * ������Computer
 * @author LiChao
 *
 */
public class Director {
	Builder mBuilder = null;
	
	public Director(Builder builder) {
		mBuilder = builder;
	}

	/**
	 * ��������
	 * @param board
	 * @param display
	 */
	public void construct(String board, String display) {
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
	
}

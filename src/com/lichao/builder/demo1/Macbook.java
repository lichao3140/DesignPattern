package com.lichao.builder.demo1;

/**
 * 具体的Computer类， Macbook
 * @author LiChao
 *
 */
public class Macbook extends Computer{
	
	protected Macbook() {
		
	}

	@Override
	public void setOS() {
		mOS = "Mac OS X 10.10";
		
	}

}

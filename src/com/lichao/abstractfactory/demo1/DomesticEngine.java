package com.lichao.abstractfactory.demo1;

/**
 * 国产发动机
 * @author LiChao
 *
 */
public class DomesticEngine implements IEngine {

	@Override
	public void engine() {
		System.out.println("国产发动机");
	}

}

package com.lichao.abstractfactory.demo1;

/**
 * 进口发动机
 * @author LiChao
 *
 */
public class ImportEngine implements IEngine {

	@Override
	public void engine() {
		System.out.println("进口发动机");
	}

}

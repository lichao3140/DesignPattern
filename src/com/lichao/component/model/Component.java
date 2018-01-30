package com.lichao.component.model;

/**
 * 抽象根节点
 * @author LiChao
 *
 */
public abstract class Component {
	/**
	 * 节点名
	 */
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	/**
	 * 具体的逻辑方法由子类实现
	 */
	public abstract void diSomething();
	
	/**
	 * 添加子节点
	 * @param child
	 */
	public abstract void addChild(Component child);
	
	/**
	 * 移除子节点
	 * @param child
	 */
	public abstract void removeChild(Component child);
	
	/**
	 * 获取子节点
	 * @param index
	 */
	public abstract Component getChildren(int index);
	
}

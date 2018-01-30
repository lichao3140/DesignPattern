package com.lichao.component.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体枝干节点
 * @author LiChao
 *
 */
public class Composite extends Component {
	
	private List<Component> components = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void diSomething() {
		System.out.println(name);
		if (null != components) {
			for (Component c : components) {
				c.diSomething();
			}
		}
	}

	/**
	 * 添加子节点
	 * @param child
	 */
	public void addChild(Component child) {
		components.add(child);
	}
	
	/**
	 * 移除子节点
	 * @param child
	 */
	public void removeChild(Component child) {
		components.remove(child);
	}
	
	/**
	 * 获取子节点
	 * @param index
	 * @return
	 */
	public Component getChildren(int index) {
		return components.get(index);
	}
}

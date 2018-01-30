package com.lichao.component.model;

import java.util.ArrayList;
import java.util.List;

/**
 * ����֦�ɽڵ�
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
	 * ����ӽڵ�
	 * @param child
	 */
	public void addChild(Component child) {
		components.add(child);
	}
	
	/**
	 * �Ƴ��ӽڵ�
	 * @param child
	 */
	public void removeChild(Component child) {
		components.remove(child);
	}
	
	/**
	 * ��ȡ�ӽڵ�
	 * @param index
	 * @return
	 */
	public Component getChildren(int index) {
		return components.get(index);
	}
}

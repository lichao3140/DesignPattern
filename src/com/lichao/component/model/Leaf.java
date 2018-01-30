package com.lichao.component.model;

/**
 * 具体叶子节点
 * @author LiChao
 *
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void diSomething() {
		System.out.println(name);
	}

	@Override
	public void addChild(Component child) {
		throw new UnsupportedOperationException("叶子节点没有子节点");
	}

	@Override
	public void removeChild(Component child) {
		throw new UnsupportedOperationException("叶子节点没有子节点");
	}

	@Override
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("叶子节点没有子节点");
	}

}

package com.lichao.component.model;

/**
 * ����Ҷ�ӽڵ�
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
		throw new UnsupportedOperationException("Ҷ�ӽڵ�û���ӽڵ�");
	}

	@Override
	public void removeChild(Component child) {
		throw new UnsupportedOperationException("Ҷ�ӽڵ�û���ӽڵ�");
	}

	@Override
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("Ҷ�ӽڵ�û���ӽڵ�");
	}

}

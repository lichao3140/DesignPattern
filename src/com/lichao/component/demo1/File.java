package com.lichao.component.demo1;

import java.util.List;

/**
 * 表示文件的类
 * @author LiChao
 *
 */
public class File extends Dir {

	public File(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void rmDir(Dir dir) {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void print() {
		System.out.println(getName());
	}

	@Override
	public List<Dir> getFiles() {
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

}

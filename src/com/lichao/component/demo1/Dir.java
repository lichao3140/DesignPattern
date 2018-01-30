package com.lichao.component.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ʾ�ļ����ļ��еĳ�����
 * @author LiChao
 *
 */
public abstract class Dir {

	/**
	 * ����һ��List��Ա�����洢�ļ����µ�����Ԫ��
	 */
	protected List<Dir> dirs = new ArrayList<>();
	
	private String name;//��ǰ�ļ����ļ�����
	
	public Dir(String name) {
		this.name = name;
	}
	
	/**
	 * ���һ���ļ������ļ���
	 * @param dir
	 */
	public abstract void addDir(Dir dir);
	
	/**
	 * �Ƴ�һ���ļ������ļ���
	 * @param dir
	 */
	public abstract void rmDir(Dir dir);
	
	/**
	 * ����ļ���������Ԫ��
	 */
	public abstract void clear();
	
	/**
	 * ����ļ���Ŀ¼�ṹ
	 */
	public abstract void print();
	
	/**
	 * ��ȡ�ļ��������е��ļ������ļ���
	 * @return
	 */
	public abstract List<Dir> getFiles();
	
	/**
	 * ��ȡ�ļ����ļ�����
	 * @return
	 */
	public String getName() {
		return name;
	}
}

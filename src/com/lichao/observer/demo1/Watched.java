package com.lichao.observer.demo1;

/**
 * ����ı��۲��ߣ�������������������ӡ��Ƴ��۲��ߣ�֪ͨ�۲��ߣ�
 * @author LiChao
 *
 */
public interface Watched {
	
	public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers();
}

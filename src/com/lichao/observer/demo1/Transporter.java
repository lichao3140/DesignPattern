package com.lichao.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 * @author LiChao
 *
 */
public class Transporter implements Watched {
	
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers() {
		for (Watcher watcher : list) {
			watcher.update();
		}
	}

}

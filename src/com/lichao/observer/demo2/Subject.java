package com.lichao.observer.demo2;

/**
 * ���󱻹۲��ߣ�Subject��
 * @author LiChao
 *
 */
public interface Subject {
	/**
     * ���Ӷ�����
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * ɾ��������
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * ֪ͨ�����߸�����Ϣ
     */
    public void notify(String message);
}

package com.lichao.observer.demo2;

public class Client {
	
	public static void main(String[] args) {
		SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        //����΢���û�
        WeixinUser user1=new WeixinUser("��Ӱ��");
        WeixinUser user2=new WeixinUser("��ü��");
        WeixinUser user3=new WeixinUser("����");
        
        //���Ĺ��ں�
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        
        //���ںŸ��·�����Ϣ�����ĵ�΢���û�
        mSubscriptionSubject.notify("���ں�ר��������");
	}
}

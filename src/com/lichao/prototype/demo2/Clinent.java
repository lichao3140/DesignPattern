package com.lichao.prototype.demo2;

public class Clinent {
	public static void main(String[] args) {
		//1.�����ĵ�����
		WordDocument originDoc = new WordDocument();
		//2.�༭�ĵ������ͼƬ��
		originDoc.setText("����һƪ�ĵ�");
		originDoc.addImage("ͼƬ1");
		originDoc.addImage("ͼƬ2");
		originDoc.addImage("ͼƬ3");
		originDoc.showDocument();
		
		//��ԭʼ�ĵ�Ϊԭ�ͣ�����һ�ݸ���
		WordDocument doc2 = originDoc.clone();
		doc2.showDocument();
		
		//�޸��ĵ�����������Ӱ��ԭʼ�ĵ�
		doc2.setText("�����޸ĺ��Doc2�ı�");
		doc2.addImage("���.jpg");
		doc2.showDocument();
		
		originDoc.showDocument();
	}
}

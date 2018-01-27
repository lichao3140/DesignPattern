package com.lichao.subject.demo1;

public class Client {
	public static void main(String[] args) {
		//����һ��С��
		ILawsuit xiaomin = new XiaoMin();
		
		//����һ��������ʦ����С����Ϊ����������ݽ�ȥ
		ILawsuit lawyer = new Lawyer(xiaomin);
		
		//��ʦ�ύ����
		lawyer.submit();
		
		//��ʦ���о�֤
		lawyer.burden();
		
		//��ʦ����С�����б绤
		lawyer.defend();
		
		//�������
		lawyer.finish();
	}
}

package com.lichao.prototype.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * �ĵ����ͣ����ݵ���ConcretePrototype��ɫ����Cloneable�Ǵ���prototype��ɫ
 * @author LiChao
 *
 */
public class WordDocument implements Cloneable {
	//�ı�
	private String mText;
	//ͼƬ���б�
	private ArrayList<String> mImages = new ArrayList<String>();
	
	public WordDocument() {
		System.out.println("------WordDocument ���캯��------");
	}

	public String getText() {
		return mText;
	}

	public void setText(String mText) {
		this.mText = mText;
	}

	public List<String> getImages() {
		return mImages;
	}

	public void addImage(String img) {
		this.mImages.add(img);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected WordDocument clone() {//���
		try {
			WordDocument doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.mImages = (ArrayList<String>) this.mImages.clone();
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ��ӡ�ĵ�����
	 */
	public void showDocument() {
		System.out.println("--------Word Content Start-------");
		System.out.println("Text :" + mText);
		System.out.println("Images List:");
		for (String imgName : mImages) {
			System.out.println("image name:" + imgName);
		}
		System.out.println("--------Word Content End-------");
	}
}

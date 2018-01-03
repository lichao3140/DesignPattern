package com.lichao.prototype.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档类型，扮演的是ConcretePrototype角色，而Cloneable是代表prototype角色
 * @author LiChao
 *
 */
public class WordDocument implements Cloneable {
	//文本
	private String mText;
	//图片名列表
	private ArrayList<String> mImages = new ArrayList<String>();
	
	public WordDocument() {
		System.out.println("------WordDocument 构造函数------");
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
	protected WordDocument clone() {//深拷贝
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
	 * 打印文档内容
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

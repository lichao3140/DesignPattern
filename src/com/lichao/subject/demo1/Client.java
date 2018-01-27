package com.lichao.subject.demo1;

public class Client {
	public static void main(String[] args) {
		//构造一个小名
		ILawsuit xiaomin = new XiaoMin();
		
		//构造一个代理律师并将小名作为构造参数传递进去
		ILawsuit lawyer = new Lawyer(xiaomin);
		
		//律师提交诉讼
		lawyer.submit();
		
		//律师进行举证
		lawyer.burden();
		
		//律师代替小名进行辩护
		lawyer.defend();
		
		//诉讼完成
		lawyer.finish();
	}
}

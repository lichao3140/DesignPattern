package com.lichao.factory.demo2;

public abstract class ExportOperate {
	
	/**
	 * 实例化ExportFileApi
	 * @return
	 */
	public abstract ExportFileApi newFileApi();
	
	/**
	 * 导出数据
	 * @param data
	 */
	public void export(String data) {
		ExportFileApi file = newFileApi();
		file.export(data);
	}
}

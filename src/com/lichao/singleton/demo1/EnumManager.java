package com.lichao.singleton.demo1;

public enum EnumManager {
	SDCardManager(10) {
		@Override
		public EnumManager getSingle() {
			return SDCardManager;
		}
	}, HttpManager(1) {
		@Override
		public EnumManager getSingle() {
			return null;
		}
	};
	
	public SdCardImpl getSingleton() {
		return new SdCardImpl();
	}
	
	public abstract EnumManager getSingle();
	private EnumManager(int type) {
		
	}
}

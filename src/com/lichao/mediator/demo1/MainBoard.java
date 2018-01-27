package com.lichao.mediator.demo1;

/**
 * 主板中介者
 * @author LiChao
 *
 */
public class MainBoard extends Mediator {
	private CDDevice cdDevice;//光驱设备
	private CPU cpu;//CPU
	private SoundCard soundCard;//声卡设备
	private GraphicsCard graphicsCard;//显卡设备

	@Override
	public void changed(Colleague c) {
		//如果是光驱读取了数据
		if (c == cdDevice) {
			handleCD((CDDevice) c);
		} else if (c == cpu) {
			handleCPU((CPU) c);
		}
	}

	/**
	 * 处理光驱读取数据后与其他设备的交互
	 * @param cdDevice
	 */
	private void handleCD(CDDevice cdDevice) {
		cpu.decodeData(cdDevice.read());
	}
	
	/**
	 * 处理CPU读取数据后与其他设备的交互
	 * @param cpu
	 */
	private void handleCPU(CPU cpu) {
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}
	
	public void setCDDevice(CDDevice cdDevice) {
		this.cdDevice = cdDevice;
	}
	
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
}

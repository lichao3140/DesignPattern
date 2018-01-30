package com.lichao.component.demo1;

public class Client {
	public static void main(String[] args) {
		//����һ��Ŀ¼�����ʾC�̸�Ŀ¼
		Dir diskC = new Folder("C");
		
		//C�̸�Ŀ¼����һ���ļ�  test.txt
		diskC.addDir(new File("test.txt"));
		
		//C�̸�Ŀ¼�»���������Ŀ¼ Windows��PerfLogs�� Program File
		Dir dirWin = new Folder("Windows");
		
		//WindowsĿ¼�����ļ� explorer.exe
		dirWin.addDir(new File("explorer.exe"));
		diskC.addDir(dirWin);
		
		Dir dirPer = new Folder("PerfLogs");
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		
		Dir dirPro = new Folder("Program File");
		dirPro.addDir(new File("ftp.txt"));
		diskC.addDir(dirPro);
		
		diskC.print();
	}
}

package com.lichao.component.demo1;

public class Client {
	public static void main(String[] args) {
		//构造一个目录对象表示C盘根目录
		Dir diskC = new Folder("C");
		
		//C盘根目录下有一个文件  test.txt
		diskC.addDir(new File("test.txt"));
		
		//C盘根目录下还有三个子目录 Windows、PerfLogs、 Program File
		Dir dirWin = new Folder("Windows");
		
		//Windows目录下有文件 explorer.exe
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

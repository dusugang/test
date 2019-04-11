package com.youbaoplus.thread;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	
	
	
	public static void main(String[] args) {
		System.out.println("请输入一个合法的路径：");
		String path=new Scanner(System.in).nextLine();
		//System.out.println("输入的路径"+path);
		
		System.out.println("请输查找文件：");
		String fileName=new Scanner(System.in).nextLine();
		System.out.println("输入的路径"+fileName);
		
		MacherCount macherCount = new MacherCount(new File(path),fileName);
		FutureTask<Integer> tash =new FutureTask<>(macherCount);
		Thread thread = new Thread(tash);
		thread.start();
		try {
			System.out.println(""+tash.get()+"匹配文件。");;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}

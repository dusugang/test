package com.youbaoplus.thread;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	
	
	
	public static void main(String[] args) {
		System.out.println("������һ���Ϸ���·����");
		String path=new Scanner(System.in).nextLine();
		//System.out.println("�����·��"+path);
		
		System.out.println("��������ļ���");
		String fileName=new Scanner(System.in).nextLine();
		System.out.println("�����·��"+fileName);
		
		MacherCount macherCount = new MacherCount(new File(path),fileName);
		FutureTask<Integer> tash =new FutureTask<>(macherCount);
		Thread thread = new Thread(tash);
		thread.start();
		try {
			System.out.println(""+tash.get()+"ƥ���ļ���");;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}

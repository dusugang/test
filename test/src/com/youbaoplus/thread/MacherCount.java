package com.youbaoplus.thread;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MacherCount implements Callable<Integer> {
	
	private File file;
	private String matchStr;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getMatchStr() {
		return matchStr;
	}
	public void setMatchStr(String matchStr) {
		this.matchStr = matchStr;
	}
	public MacherCount(File file, String matchStr) {
		super();
		this.file = file;
		this.matchStr = matchStr;
	}
	@Override
	public Integer call()  {
		File[] listFiles = file.listFiles();
		int counter =0;
		ArrayList<FutureTask<Integer>> arrayList = new ArrayList<>();
		
		for (File file : listFiles) {
			if(file.isDirectory()){
				MacherCount MacherCount =  new MacherCount(file, matchStr);
				FutureTask<Integer> subtask=new FutureTask<>(MacherCount);
				Thread thread = new Thread(subtask);
				thread.start();
				arrayList.add(subtask);
			}else{
				if(search(file)){
					counter++;
				}
			}
		}
		for (FutureTask<Integer> futureTask : arrayList) {
			try {
				counter+=futureTask.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return counter;
	}
	
	public boolean search(File file){
		
		return file.getName().equals(this.matchStr);
	}
	
}

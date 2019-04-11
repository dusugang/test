package com.youbaoplus.tee;

import java.util.Iterator;

public class TranRunable implements Runnable {
	
	private Bank bank;
	private int fromIndex;
	private double maxBanlance;
	
	public static final int ACCOUNTS=10;
	public static final double AMOUNT=1000;
	
	

	public TranRunable(Bank bank, int fromIndex, double maxBanlance) {
		this.bank = bank;
		this.fromIndex = fromIndex;
		this.maxBanlance = maxBanlance;
	}



	@Override
	public void run() {
		
		while(true){
			//System.out.println(this.bank);
			int toAccount=(int)(Math.random()*bank.size());
			double toAmount=Math.random()*maxBanlance;
			try {
				bank.transAmount(this.fromIndex,toAccount,toAmount);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) {
		
		Bank b =new Bank(ACCOUNTS, AMOUNT);
		for (int i = 0; i < ACCOUNTS; i++) {
			
			TranRunable r=new TranRunable(b, i,AMOUNT );
			Thread t=new Thread(r);
			t.start();
		}
	}



	
}

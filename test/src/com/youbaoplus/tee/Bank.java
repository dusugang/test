package com.youbaoplus.tee;

public class Bank {
	private final double []accounts;
	
	public Bank(int n,double balance){
		accounts =new double[n];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i]=balance;
		}
	}
	
	public int size(){
		return accounts.length;
	}
	
	public synchronized void transAmount(int fromIndex, int toAccount, double toAmount) throws InterruptedException {
		this.toString();
		if(accounts[fromIndex]<toAmount) {
			this.wait();
		} 
	
		accounts[fromIndex]-=toAmount;
		System.out.printf("%10.2f from %d to %d", toAmount,fromIndex,toAccount);
		accounts[toAccount]+=toAmount;
		this.notifyAll();
		double totalBalance = getTotalBalance();
		if(totalBalance!=100000){
			System.out.println("当前线程"+Thread.currentThread().getName());
			System.out.printf("总额：%10.2f%n",totalBalance);
		}
		
	}
	
	public synchronized double getTotalBalance(){
		double sum=0;
		for (double acc : accounts) {
			sum+=acc;
		}
		return sum;
	}


}

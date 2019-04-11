package com.youbaoplus.tee;

public class Pair<T> {
	private T first=null;
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	private T second=null;
	
	public Pair(){
		
	}
	
	public Pair(T first,T second){
		this.first=first;
		this.second=second;
	}
	
	
	

}

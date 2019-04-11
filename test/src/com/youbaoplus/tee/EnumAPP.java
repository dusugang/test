package com.youbaoplus.tee;

public enum EnumAPP{
	
	ANHUI("Íî",1),BJ("¾©",2);
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int n;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	private EnumAPP(String name,int n){
		this.name=name;
		this.n=n;
	}
	
	public static void main(String[] args) {
		System.out.println(EnumAPP.ANHUI.getN());
	}
	
}

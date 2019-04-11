package com.youbaoplus.tee;

import java.util.Iterator;

public class PaireTest1 {

	public static void main(String[] args) {
		Manager fo = new Manager("zhangweiyang", 31, 10000);
		Manager so = new Manager("dusugang", 35, 2000);
		Pair<Manager> pair = new Pair<>();
		pair.setFirst(fo);
		pair.setSecond(so);
		new PaireTest1().printBonus(pair);
		fo.setBounds(30000);
		so.setBounds(20000);
		
		

	}

	public void printBonus(Pair<? extends Employee> p){
		System.out.println("first:="+p.getFirst().getName()+" bonus:"+((Manager)p.getFirst()).getBounds()+"\nsecond:="+p.getSecond().getName()+" bounus:="+((Manager)p.getSecond()).getBounds());
	}
	
	
}

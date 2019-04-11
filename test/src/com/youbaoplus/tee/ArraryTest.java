package com.youbaoplus.tee;

import java.lang.reflect.Array;

import javax.swing.text.html.MinimalHTMLWriter;

public class ArraryTest {
	
	public static void main(String[] args) {
		int []a={1,5,9,10};
		a=(int[])goodCopyOf(a,10);
		System.out.println(a.length);
		
	}
	
	public static Object goodCopyOf(Object b,int newLength){
		Class cls=b.getClass();
		if(!cls.isArray()){
			return null;
		}
		Class arrayTpye=cls.getComponentType();
		int length=Array.getLength(b);
		Object newArray = Array.newInstance(arrayTpye, newLength);
		System.arraycopy(b, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}

}

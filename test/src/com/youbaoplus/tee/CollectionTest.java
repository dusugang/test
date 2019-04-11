package com.youbaoplus.tee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		Scanner sanner=new Scanner(System.in);
		while(sanner.hasNextLine()){
			String word=sanner.nextLine();
			if("".equals(word)){
				break;
			}
			set.add(word);
		}
		
		Iterator<String> iterator = set.iterator();
		for (int i = 0; iterator.hasNext()&& i<20; i++) {
			System.err.println(iterator.next());
		}
	}

}

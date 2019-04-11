package com.youbaoplus.tee;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ActionListener action = new TimePrinter();
		Timer timer=new Timer(10000, action);
		timer.start();
		
		JOptionPane.showMessageDialog(null, "ddddd");
		
		System.exit(0);

	}

}

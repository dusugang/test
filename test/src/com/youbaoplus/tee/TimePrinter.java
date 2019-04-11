package com.youbaoplus.tee;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date date=new Date();
		System.out.println("----"+date);
		Toolkit.getDefaultToolkit().beep();

	}

}

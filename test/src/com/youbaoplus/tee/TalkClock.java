package com.youbaoplus.tee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TalkClock {
	private int internal;
	private boolean beep = false;

	public TalkClock(int inerN, boolean bepN) {
		this.internal = inerN;
		this.beep = bepN;
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		new TalkClock(1000, true).start();
	}

	public void start() throws InterruptedException {

		ActionListener actionListener = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("------------------");
				if (beep) {

				}

			}
		};
		Timer timer = new Timer(internal, actionListener);
		timer.start();
		Thread.sleep(10000);
		timer.stop();
	}

}

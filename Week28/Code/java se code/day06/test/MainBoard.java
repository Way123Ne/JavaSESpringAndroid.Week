package com.wayne.reflect.test;

public class MainBoard {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("main board run...");
	}

	public void usePCI(PCI p) { //PCI p = new SoundCard();
		if (p != null) {
			p.open();
			p.close();
		}
	}
	
}

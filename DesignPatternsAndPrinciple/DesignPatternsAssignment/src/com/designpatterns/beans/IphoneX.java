package com.designpatterns.beans;

public class IphoneX implements Smartphone{

	private int ram;
	private String onMusic;
	private String offMusic;
	

	public IphoneX(int ram, String onMusic, String offMusic) {
		super();
		this.ram = ram;
		this.onMusic = onMusic;
		this.offMusic = offMusic;
	}

	@Override
	public int getRam() {
		return this.ram;
	}

	@Override
	public void switchOn() {
		System.out.println("IphoneX switch on with music "+onMusic+" and Siri says Hi.");
	}

	@Override
	public void switchOff() {
		System.out.println("IphoneX switched off with music "+offMusic+" Siri says bye bye.");
	}

}

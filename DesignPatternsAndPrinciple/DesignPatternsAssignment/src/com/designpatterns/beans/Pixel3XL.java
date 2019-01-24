package com.designpatterns.beans;

public class Pixel3XL implements Smartphone{
	
	private int ram;
	private String onMusic;
	private String offMusic;
	
	public Pixel3XL(int ram, String onMusic, String offMusic) {
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
		System.out.println("Pixel3XL is switched on with music "+onMusic+" and Google Ok is at your service");
	}

	@Override
	public void switchOff() {
		System.out.println("Pixel3XL is switched off with music "+offMusic+" and Hope Google Ok gave you perfect service.");
	}
	
	

}

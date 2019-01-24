package com.designpatterns.abstractfactory;

import com.designpatterns.beans.Pixel3XL;
import com.designpatterns.beans.Smartphone;

public class PixelFactory implements SmartphoneAbstractFactory {

	private int ram;
	private String onMusic;
	private String offMusic;
	
	
	
	public PixelFactory(int ram, String onMusic, String offMusic) {
		super();
		this.ram = ram;
		this.onMusic = onMusic;
		this.offMusic = offMusic;
	}

	public Smartphone createSmartphone() {
     	return new Pixel3XL(this.ram,this.onMusic,this.offMusic);
	}

}

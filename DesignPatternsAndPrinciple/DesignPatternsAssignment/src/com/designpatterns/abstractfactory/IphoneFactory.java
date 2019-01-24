package com.designpatterns.abstractfactory;

import com.designpatterns.beans.IphoneX;
import com.designpatterns.beans.Smartphone;

public class IphoneFactory implements SmartphoneAbstractFactory {
	
	
	private int ram;
	private String onMusic;
	private String offMusic;
	
	public IphoneFactory(int ram, String onMusic, String offMusic) {
		super();
		this.ram = ram;
		this.onMusic = onMusic;
		this.offMusic = offMusic;
	}

	public Smartphone createSmartphone() {
		return new IphoneX(this.ram,this.onMusic,this.offMusic);
	}

}

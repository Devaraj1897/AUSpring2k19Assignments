package com.designpatterns.abstractfactory;

import com.designpatterns.beans.Smartphone;

public class SmartPhoneFactory  {
	
	public static Smartphone createSmartphone(SmartphoneAbstractFactory saf) {
		return saf.createSmartphone();
	}

}

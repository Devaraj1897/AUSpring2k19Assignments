package com.designpattern.main;

import com.designpatterns.abstractfactory.IphoneFactory;
import com.designpatterns.abstractfactory.PixelFactory;
import com.designpatterns.abstractfactory.SmartPhoneFactory;
import com.designpatterns.beans.Smartphone;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		
		Smartphone iphone= SmartPhoneFactory.createSmartphone(new IphoneFactory(8,"quack quack","grrrrrrrr"));
		Smartphone pixel=SmartPhoneFactory.createSmartphone(new PixelFactory(16,"ping ping ping","pong pong pong"));
		
		System.out.println("Iphone-");
		System.out.println("RAM:"+iphone.getRam());
		System.out.println("Switch On:");
		iphone.switchOn();
		System.out.println("Switch Off");
		iphone.switchOff();
		
		System.out.println("========================================");
		
		System.out.println("Pixel-");
		System.out.println("RAM:"+pixel.getRam());
		System.out.println("Switch On:");
		pixel.switchOn();
		System.out.println("Switch Off");
		pixel.switchOff();
	}

}

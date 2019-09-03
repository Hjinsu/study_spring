package com.test03;

import org.springframework.stereotype.Component;

@Component("samsung")
public class samsung implements TV{

	@Override
	public void powerOn() {
		System.out.println("samsong power on");
	}

	@Override
	public void powerDown() {
		System.out.println("samsong power down");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("samsong volume up");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("samsong volume down");
		
	}

}
